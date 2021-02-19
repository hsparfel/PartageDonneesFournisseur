package com.pouillos.partagedonneesfournisseur.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pouillos.partagedonneesfournisseur.MyApp;
import com.pouillos.partagedonneesfournisseur.activities.AccueilActivity;
import com.pouillos.partagedonneesfournisseur.dao.DaoMaster;
import com.pouillos.partagedonneesfournisseur.dao.DaoSession;
import com.pouillos.partagedonneesfournisseur.dao.DonneesDao;
import com.pouillos.partagedonneesfournisseur.entities.Donnees;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class DonneesContentProvider extends ContentProvider {

    private DaoSession daoSession;
    private DonneesDao donneesDao;

    // FOR DATA
    public static final String AUTHORITY = "com.pouillos.partagedonneesfournisseur.provider";
    public static final String TABLE_NAME = Donnees.class.getSimpleName();
    public static final Uri URI_ITEM = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);

    public void initialiserDao() {
        //Base pendant dev
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(MyApp.getInstance(), "partage_donnees_fournisseur_db");
        //Base de prod
        //AppOpenHelper helper = new AppOpenHelper(this, "partage_donnees_fournisseur_db", null);
        Database db = helper.getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    @Override
    public boolean onCreate() {
        initialiserDao();
        donneesDao = daoSession.getDonneesDao();
        return false;
    }

    /*@Nullable
    public List<Donnees> listAllDonnees() {
        List<Donnees> listAllDonnees = donneesDao.loadAll();
        return listAllDonnees;
    }*/

    public Cursor getCursorFromList(List<Donnees> listDonnees) {
        MatrixCursor cursor = new MatrixCursor(
                new String[] {"_id", "nom"}
        );
        for ( Donnees donnees : listDonnees ) {
            cursor.newRow()
                    .add("_id", donnees.getId())
                    .add("nom", donnees.getNom());
        }
        return cursor;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        if (selection == null) {
            Cursor cursor = getCursorFromList(donneesDao.loadAll());
            return cursor;
        }
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
