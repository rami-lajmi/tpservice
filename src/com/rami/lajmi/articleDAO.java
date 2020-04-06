package com.rami.lajmi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;

public class articleDAO extends Dao<Article>{

    public void leverException() throws MesExceptions {
        // ...
        throw new MesExceptions("Houston, we have a problem ! dosen't exist !");
    }

    @Override
    public Article find(int id) {
        Article article = new Article();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM article WHERE id = " + id
                    );
            if(result.first())
                article = new Article(id, result.getString("titre"),result.getString("contenu"),result.getInt("id_user"),result.getString("date_creation"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

            return article;


    }

    @Override
    public Article create(Article obj) {
        return null;
    }

    @Override
    public Article update(Article obj) {
        return null;
    }

    @Override
    public void delete(Article obj) {

    }
}
