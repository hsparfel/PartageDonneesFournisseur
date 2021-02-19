package com.pouillos.partagedonneesfournisseur.entities;

import android.content.ContentValues;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

@Entity
public class Donnees implements Comparable<Donnees> {

    @Id
    private Long id;

    @NotNull
    private String nom;


    @Generated(hash = 226416671)
    public Donnees(Long id, @NotNull String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Generated(hash = 1034954348)
    public Donnees() {
    }


    @Override
    public int compareTo(Donnees o) {
        return this.getNom().compareTo(o.getNom());
    }

    @Override
    public String toString() {
        return nom;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // --- UTILS ---
    public static Donnees fromContentValues(ContentValues values) {
        final Donnees donnees = new Donnees();
        if (values.containsKey("id")) donnees.setId(values.getAsLong("id"));
        if (values.containsKey("nom")) donnees.setNom(values.getAsString("nom"));
        return donnees;
    }
}
