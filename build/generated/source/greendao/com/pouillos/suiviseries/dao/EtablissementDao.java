package com.pouillos.suiviseries.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pouillos.suiviseries.entities.Departement;
import com.pouillos.suiviseries.entities.Region;
import com.pouillos.suiviseries.entities.TypeEtablissement;

import com.pouillos.suiviseries.entities.Etablissement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ETABLISSEMENT".
*/
public class EtablissementDao extends AbstractDao<Etablissement, Long> {

    public static final String TABLENAME = "ETABLISSEMENT";

    /**
     * Properties of entity Etablissement.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NumeroFinessET = new Property(1, String.class, "numeroFinessET", false, "NUMERO_FINESS_ET");
        public final static Property RaisonSocial = new Property(2, String.class, "raisonSocial", false, "RAISON_SOCIAL");
        public final static Property Adresse = new Property(3, String.class, "adresse", false, "ADRESSE");
        public final static Property Cp = new Property(4, String.class, "cp", false, "CP");
        public final static Property Ville = new Property(5, String.class, "ville", false, "VILLE");
        public final static Property Telephone = new Property(6, String.class, "telephone", false, "TELEPHONE");
        public final static Property Fax = new Property(7, String.class, "fax", false, "FAX");
        public final static Property DepartementId = new Property(8, long.class, "departementId", false, "DEPARTEMENT_ID");
        public final static Property RegionId = new Property(9, long.class, "regionId", false, "REGION_ID");
        public final static Property Latitude = new Property(10, double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(11, double.class, "longitude", false, "LONGITUDE");
        public final static Property TypeEtablissementId = new Property(12, long.class, "typeEtablissementId", false, "TYPE_ETABLISSEMENT_ID");
        public final static Property IsSelected = new Property(13, boolean.class, "isSelected", false, "IS_SELECTED");
    }

    private DaoSession daoSession;


    public EtablissementDao(DaoConfig config) {
        super(config);
    }
    
    public EtablissementDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ETABLISSEMENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NUMERO_FINESS_ET\" TEXT," + // 1: numeroFinessET
                "\"RAISON_SOCIAL\" TEXT," + // 2: raisonSocial
                "\"ADRESSE\" TEXT," + // 3: adresse
                "\"CP\" TEXT," + // 4: cp
                "\"VILLE\" TEXT," + // 5: ville
                "\"TELEPHONE\" TEXT," + // 6: telephone
                "\"FAX\" TEXT," + // 7: fax
                "\"DEPARTEMENT_ID\" INTEGER NOT NULL ," + // 8: departementId
                "\"REGION_ID\" INTEGER NOT NULL ," + // 9: regionId
                "\"LATITUDE\" REAL NOT NULL ," + // 10: latitude
                "\"LONGITUDE\" REAL NOT NULL ," + // 11: longitude
                "\"TYPE_ETABLISSEMENT_ID\" INTEGER NOT NULL ," + // 12: typeEtablissementId
                "\"IS_SELECTED\" INTEGER NOT NULL );"); // 13: isSelected
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ETABLISSEMENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Etablissement entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String numeroFinessET = entity.getNumeroFinessET();
        if (numeroFinessET != null) {
            stmt.bindString(2, numeroFinessET);
        }
 
        String raisonSocial = entity.getRaisonSocial();
        if (raisonSocial != null) {
            stmt.bindString(3, raisonSocial);
        }
 
        String adresse = entity.getAdresse();
        if (adresse != null) {
            stmt.bindString(4, adresse);
        }
 
        String cp = entity.getCp();
        if (cp != null) {
            stmt.bindString(5, cp);
        }
 
        String ville = entity.getVille();
        if (ville != null) {
            stmt.bindString(6, ville);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(7, telephone);
        }
 
        String fax = entity.getFax();
        if (fax != null) {
            stmt.bindString(8, fax);
        }
        stmt.bindLong(9, entity.getDepartementId());
        stmt.bindLong(10, entity.getRegionId());
        stmt.bindDouble(11, entity.getLatitude());
        stmt.bindDouble(12, entity.getLongitude());
        stmt.bindLong(13, entity.getTypeEtablissementId());
        stmt.bindLong(14, entity.getIsSelected() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Etablissement entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String numeroFinessET = entity.getNumeroFinessET();
        if (numeroFinessET != null) {
            stmt.bindString(2, numeroFinessET);
        }
 
        String raisonSocial = entity.getRaisonSocial();
        if (raisonSocial != null) {
            stmt.bindString(3, raisonSocial);
        }
 
        String adresse = entity.getAdresse();
        if (adresse != null) {
            stmt.bindString(4, adresse);
        }
 
        String cp = entity.getCp();
        if (cp != null) {
            stmt.bindString(5, cp);
        }
 
        String ville = entity.getVille();
        if (ville != null) {
            stmt.bindString(6, ville);
        }
 
        String telephone = entity.getTelephone();
        if (telephone != null) {
            stmt.bindString(7, telephone);
        }
 
        String fax = entity.getFax();
        if (fax != null) {
            stmt.bindString(8, fax);
        }
        stmt.bindLong(9, entity.getDepartementId());
        stmt.bindLong(10, entity.getRegionId());
        stmt.bindDouble(11, entity.getLatitude());
        stmt.bindDouble(12, entity.getLongitude());
        stmt.bindLong(13, entity.getTypeEtablissementId());
        stmt.bindLong(14, entity.getIsSelected() ? 1L: 0L);
    }

    @Override
    protected final void attachEntity(Etablissement entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Etablissement readEntity(Cursor cursor, int offset) {
        Etablissement entity = new Etablissement( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // numeroFinessET
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // raisonSocial
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // adresse
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // cp
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ville
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // telephone
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // fax
            cursor.getLong(offset + 8), // departementId
            cursor.getLong(offset + 9), // regionId
            cursor.getDouble(offset + 10), // latitude
            cursor.getDouble(offset + 11), // longitude
            cursor.getLong(offset + 12), // typeEtablissementId
            cursor.getShort(offset + 13) != 0 // isSelected
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Etablissement entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNumeroFinessET(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setRaisonSocial(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAdresse(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCp(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setVille(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTelephone(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFax(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDepartementId(cursor.getLong(offset + 8));
        entity.setRegionId(cursor.getLong(offset + 9));
        entity.setLatitude(cursor.getDouble(offset + 10));
        entity.setLongitude(cursor.getDouble(offset + 11));
        entity.setTypeEtablissementId(cursor.getLong(offset + 12));
        entity.setIsSelected(cursor.getShort(offset + 13) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Etablissement entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Etablissement entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Etablissement entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getDepartementDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getRegionDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getTypeEtablissementDao().getAllColumns());
            builder.append(" FROM ETABLISSEMENT T");
            builder.append(" LEFT JOIN DEPARTEMENT T0 ON T.\"DEPARTEMENT_ID\"=T0.\"_id\"");
            builder.append(" LEFT JOIN REGION T1 ON T.\"REGION_ID\"=T1.\"_id\"");
            builder.append(" LEFT JOIN TYPE_ETABLISSEMENT T2 ON T.\"TYPE_ETABLISSEMENT_ID\"=T2.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Etablissement loadCurrentDeep(Cursor cursor, boolean lock) {
        Etablissement entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Departement departement = loadCurrentOther(daoSession.getDepartementDao(), cursor, offset);
         if(departement != null) {
            entity.setDepartement(departement);
        }
        offset += daoSession.getDepartementDao().getAllColumns().length;

        Region region = loadCurrentOther(daoSession.getRegionDao(), cursor, offset);
         if(region != null) {
            entity.setRegion(region);
        }
        offset += daoSession.getRegionDao().getAllColumns().length;

        TypeEtablissement typeEtablissement = loadCurrentOther(daoSession.getTypeEtablissementDao(), cursor, offset);
         if(typeEtablissement != null) {
            entity.setTypeEtablissement(typeEtablissement);
        }

        return entity;    
    }

    public Etablissement loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Etablissement> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Etablissement> list = new ArrayList<Etablissement>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Etablissement> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Etablissement> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
