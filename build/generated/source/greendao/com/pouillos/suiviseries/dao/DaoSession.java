package com.pouillos.suiviseries.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.pouillos.suiviseries.entities.Contact;
import com.pouillos.suiviseries.entities.ContactIgnore;
import com.pouillos.suiviseries.entities.Departement;
import com.pouillos.suiviseries.entities.Etablissement;
import com.pouillos.suiviseries.entities.ImportContact;
import com.pouillos.suiviseries.entities.ImportEtablissement;
import com.pouillos.suiviseries.entities.Profession;
import com.pouillos.suiviseries.entities.Region;
import com.pouillos.suiviseries.entities.SavoirFaire;
import com.pouillos.suiviseries.entities.TypeEtablissement;

import com.pouillos.suiviseries.dao.ContactDao;
import com.pouillos.suiviseries.dao.ContactIgnoreDao;
import com.pouillos.suiviseries.dao.DepartementDao;
import com.pouillos.suiviseries.dao.EtablissementDao;
import com.pouillos.suiviseries.dao.ImportContactDao;
import com.pouillos.suiviseries.dao.ImportEtablissementDao;
import com.pouillos.suiviseries.dao.ProfessionDao;
import com.pouillos.suiviseries.dao.RegionDao;
import com.pouillos.suiviseries.dao.SavoirFaireDao;
import com.pouillos.suiviseries.dao.TypeEtablissementDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactDaoConfig;
    private final DaoConfig contactIgnoreDaoConfig;
    private final DaoConfig departementDaoConfig;
    private final DaoConfig etablissementDaoConfig;
    private final DaoConfig importContactDaoConfig;
    private final DaoConfig importEtablissementDaoConfig;
    private final DaoConfig professionDaoConfig;
    private final DaoConfig regionDaoConfig;
    private final DaoConfig savoirFaireDaoConfig;
    private final DaoConfig typeEtablissementDaoConfig;

    private final ContactDao contactDao;
    private final ContactIgnoreDao contactIgnoreDao;
    private final DepartementDao departementDao;
    private final EtablissementDao etablissementDao;
    private final ImportContactDao importContactDao;
    private final ImportEtablissementDao importEtablissementDao;
    private final ProfessionDao professionDao;
    private final RegionDao regionDao;
    private final SavoirFaireDao savoirFaireDao;
    private final TypeEtablissementDao typeEtablissementDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactDaoConfig = daoConfigMap.get(ContactDao.class).clone();
        contactDaoConfig.initIdentityScope(type);

        contactIgnoreDaoConfig = daoConfigMap.get(ContactIgnoreDao.class).clone();
        contactIgnoreDaoConfig.initIdentityScope(type);

        departementDaoConfig = daoConfigMap.get(DepartementDao.class).clone();
        departementDaoConfig.initIdentityScope(type);

        etablissementDaoConfig = daoConfigMap.get(EtablissementDao.class).clone();
        etablissementDaoConfig.initIdentityScope(type);

        importContactDaoConfig = daoConfigMap.get(ImportContactDao.class).clone();
        importContactDaoConfig.initIdentityScope(type);

        importEtablissementDaoConfig = daoConfigMap.get(ImportEtablissementDao.class).clone();
        importEtablissementDaoConfig.initIdentityScope(type);

        professionDaoConfig = daoConfigMap.get(ProfessionDao.class).clone();
        professionDaoConfig.initIdentityScope(type);

        regionDaoConfig = daoConfigMap.get(RegionDao.class).clone();
        regionDaoConfig.initIdentityScope(type);

        savoirFaireDaoConfig = daoConfigMap.get(SavoirFaireDao.class).clone();
        savoirFaireDaoConfig.initIdentityScope(type);

        typeEtablissementDaoConfig = daoConfigMap.get(TypeEtablissementDao.class).clone();
        typeEtablissementDaoConfig.initIdentityScope(type);

        contactDao = new ContactDao(contactDaoConfig, this);
        contactIgnoreDao = new ContactIgnoreDao(contactIgnoreDaoConfig, this);
        departementDao = new DepartementDao(departementDaoConfig, this);
        etablissementDao = new EtablissementDao(etablissementDaoConfig, this);
        importContactDao = new ImportContactDao(importContactDaoConfig, this);
        importEtablissementDao = new ImportEtablissementDao(importEtablissementDaoConfig, this);
        professionDao = new ProfessionDao(professionDaoConfig, this);
        regionDao = new RegionDao(regionDaoConfig, this);
        savoirFaireDao = new SavoirFaireDao(savoirFaireDaoConfig, this);
        typeEtablissementDao = new TypeEtablissementDao(typeEtablissementDaoConfig, this);

        registerDao(Contact.class, contactDao);
        registerDao(ContactIgnore.class, contactIgnoreDao);
        registerDao(Departement.class, departementDao);
        registerDao(Etablissement.class, etablissementDao);
        registerDao(ImportContact.class, importContactDao);
        registerDao(ImportEtablissement.class, importEtablissementDao);
        registerDao(Profession.class, professionDao);
        registerDao(Region.class, regionDao);
        registerDao(SavoirFaire.class, savoirFaireDao);
        registerDao(TypeEtablissement.class, typeEtablissementDao);
    }
    
    public void clear() {
        contactDaoConfig.clearIdentityScope();
        contactIgnoreDaoConfig.clearIdentityScope();
        departementDaoConfig.clearIdentityScope();
        etablissementDaoConfig.clearIdentityScope();
        importContactDaoConfig.clearIdentityScope();
        importEtablissementDaoConfig.clearIdentityScope();
        professionDaoConfig.clearIdentityScope();
        regionDaoConfig.clearIdentityScope();
        savoirFaireDaoConfig.clearIdentityScope();
        typeEtablissementDaoConfig.clearIdentityScope();
    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public ContactIgnoreDao getContactIgnoreDao() {
        return contactIgnoreDao;
    }

    public DepartementDao getDepartementDao() {
        return departementDao;
    }

    public EtablissementDao getEtablissementDao() {
        return etablissementDao;
    }

    public ImportContactDao getImportContactDao() {
        return importContactDao;
    }

    public ImportEtablissementDao getImportEtablissementDao() {
        return importEtablissementDao;
    }

    public ProfessionDao getProfessionDao() {
        return professionDao;
    }

    public RegionDao getRegionDao() {
        return regionDao;
    }

    public SavoirFaireDao getSavoirFaireDao() {
        return savoirFaireDao;
    }

    public TypeEtablissementDao getTypeEtablissementDao() {
        return typeEtablissementDao;
    }

}
