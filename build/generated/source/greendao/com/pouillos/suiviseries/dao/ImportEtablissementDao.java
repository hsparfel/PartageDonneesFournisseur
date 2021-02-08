package com.pouillos.suiviseries.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pouillos.suiviseries.entities.ImportEtablissement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "IMPORT_ETABLISSEMENT".
*/
public class ImportEtablissementDao extends AbstractDao<ImportEtablissement, Long> {

    public static final String TABLENAME = "IMPORT_ETABLISSEMENT";

    /**
     * Properties of entity ImportEtablissement.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Path = new Property(1, String.class, "path", false, "PATH");
        public final static Property ImportCompleted = new Property(2, boolean.class, "importCompleted", false, "IMPORT_COMPLETED");
        public final static Property DateDebut = new Property(3, String.class, "dateDebut", false, "DATE_DEBUT");
        public final static Property DateFin = new Property(4, String.class, "dateFin", false, "DATE_FIN");
        public final static Property NbLigneLue = new Property(5, int.class, "nbLigneLue", false, "NB_LIGNE_LUE");
        public final static Property NbImportEffectue = new Property(6, int.class, "nbImportEffectue", false, "NB_IMPORT_EFFECTUE");
        public final static Property NbImportIgnore = new Property(7, int.class, "nbImportIgnore", false, "NB_IMPORT_IGNORE");
    }


    public ImportEtablissementDao(DaoConfig config) {
        super(config);
    }
    
    public ImportEtablissementDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"IMPORT_ETABLISSEMENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PATH\" TEXT NOT NULL ," + // 1: path
                "\"IMPORT_COMPLETED\" INTEGER NOT NULL ," + // 2: importCompleted
                "\"DATE_DEBUT\" TEXT," + // 3: dateDebut
                "\"DATE_FIN\" TEXT," + // 4: dateFin
                "\"NB_LIGNE_LUE\" INTEGER NOT NULL ," + // 5: nbLigneLue
                "\"NB_IMPORT_EFFECTUE\" INTEGER NOT NULL ," + // 6: nbImportEffectue
                "\"NB_IMPORT_IGNORE\" INTEGER NOT NULL );"); // 7: nbImportIgnore
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"IMPORT_ETABLISSEMENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ImportEtablissement entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPath());
        stmt.bindLong(3, entity.getImportCompleted() ? 1L: 0L);
 
        String dateDebut = entity.getDateDebut();
        if (dateDebut != null) {
            stmt.bindString(4, dateDebut);
        }
 
        String dateFin = entity.getDateFin();
        if (dateFin != null) {
            stmt.bindString(5, dateFin);
        }
        stmt.bindLong(6, entity.getNbLigneLue());
        stmt.bindLong(7, entity.getNbImportEffectue());
        stmt.bindLong(8, entity.getNbImportIgnore());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ImportEtablissement entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPath());
        stmt.bindLong(3, entity.getImportCompleted() ? 1L: 0L);
 
        String dateDebut = entity.getDateDebut();
        if (dateDebut != null) {
            stmt.bindString(4, dateDebut);
        }
 
        String dateFin = entity.getDateFin();
        if (dateFin != null) {
            stmt.bindString(5, dateFin);
        }
        stmt.bindLong(6, entity.getNbLigneLue());
        stmt.bindLong(7, entity.getNbImportEffectue());
        stmt.bindLong(8, entity.getNbImportIgnore());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ImportEtablissement readEntity(Cursor cursor, int offset) {
        ImportEtablissement entity = new ImportEtablissement( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // path
            cursor.getShort(offset + 2) != 0, // importCompleted
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dateDebut
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // dateFin
            cursor.getInt(offset + 5), // nbLigneLue
            cursor.getInt(offset + 6), // nbImportEffectue
            cursor.getInt(offset + 7) // nbImportIgnore
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ImportEtablissement entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPath(cursor.getString(offset + 1));
        entity.setImportCompleted(cursor.getShort(offset + 2) != 0);
        entity.setDateDebut(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDateFin(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNbLigneLue(cursor.getInt(offset + 5));
        entity.setNbImportEffectue(cursor.getInt(offset + 6));
        entity.setNbImportIgnore(cursor.getInt(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ImportEtablissement entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ImportEtablissement entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ImportEtablissement entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
