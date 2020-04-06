package com.rami.lajmi;

import com.sun.corba.se.impl.orb.ParserTable;

public class Article {
    private int id;
    private String titre;
    private String contenu;
    private int id_user;
    private String date_creation;

    public Article() {
    }

    public Article(int id, String titre, String contenu, int id_user, String date_creation) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.id_user = id_user;
        this.date_creation = date_creation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void getTitre() {
        System.out.println(titre);
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void getContenu() {
        System.out.println(contenu);
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getIdUser() {
        return id_user;
    }
    public void setIdUser(int id_user) {
        this.id_user = id_user;
    }

    public void getDateCreation() {
        System.out.println(date_creation);
    }
    public void setDateCreation(String date_creation) {
        this.date_creation = date_creation;
    }
}
