package com.rami.lajmi;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //userDAO journaliste = new userDAO();

        Dao<User> journaliste = new userDAO();

        Dao<Article> article = new articleDAO();

        //journaliste
        journaliste.find(1).getNom();
        journaliste.find(1).getPrenom();
        journaliste.find(1).getDate();

        System.out.println("------------------------ Les articles --------------------------");


            if(article.find(5) == null){
                System.out.println("Aucun index");
            }


            //journaliste.insertUser();

        //update user
        //journaliste.updateUser();

        //del user

    }
}
