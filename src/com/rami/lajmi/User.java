package com.rami.lajmi;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String date;

    public User() {
    }
    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public User(int id, String nom, String prenom, String date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void getNom() {
        System.out.println(nom);
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void getDate() {
        System.out.println(date);
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void getPrenom() {
        System.out.println(prenom);
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
