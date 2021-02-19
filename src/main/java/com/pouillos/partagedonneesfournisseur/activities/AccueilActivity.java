package com.pouillos.partagedonneesfournisseur.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.stetho.Stetho;
import com.google.android.material.snackbar.Snackbar;
import com.pouillos.partagedonneesfournisseur.R;
import com.pouillos.partagedonneesfournisseur.entities.Donnees;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import icepick.Icepick;

public class AccueilActivity extends NavDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Icepick.restoreInstanceState(this, savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Stetho.initializeWithDefaults(this);

        this.configureToolBar();

        ButterKnife.bind(this);

        setTitle("Accueil Fournisseur");

        remplirDb();
    }

    public void remplirDb() {
        donneesDao.deleteAll();
        if (donneesDao.count()==0) {
            Donnees donnees = new Donnees(1l, "Bob");
            donneesDao.insert(donnees);
            donnees = new Donnees(2l, "John");
            donneesDao.insert(donnees);
            donnees = new Donnees(3l, "Marcel");
            donneesDao.insert(donnees);
            donnees = new Donnees(4l, "Jean-Michel");
            donneesDao.insert(donnees);
            donnees = new Donnees(5l, "Mike");
            donneesDao.insert(donnees);
            donnees = new Donnees(6l, "James");
            donneesDao.insert(donnees);
        }
    }
}
