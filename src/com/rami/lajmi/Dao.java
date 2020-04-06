package com.rami.lajmi;

import java.sql.Connection;

public abstract class Dao<T> {

    public Connection connect = connexion.getConnection();

    /**
     * Chercher une entrée dans la base de données par rapport a un objet
    */
    public abstract T find(int id);

    //    public abstract T all();
    /**
     * Permet de créer une entrée dans la base de données
     * par rapport à un objet
     */
    public abstract T create(T obj);

    /**
     * Permet de mettre à jour les données d'une entrée dans la base
     */
    public abstract T update(T obj);

    /**
     * Permet la suppression d'une entrée de la base
     */
    public abstract void delete(T obj);

}
