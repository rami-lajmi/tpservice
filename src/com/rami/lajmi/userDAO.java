package com.rami.lajmi;

import java.sql.*;
import java.util.Set;

public class userDAO extends Dao<User> {

    public User find(int id) {
        User user = new User();
        try {
            ResultSet result = this.connect
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery(
                            "SELECT * FROM users WHERE id = " + id
                    );
            if(result.first())
                user = new User(id, result.getString("nom"),result.getString("prenom"),result.getString("creation"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public User update(User obj) {
        return null;
    }

    @Override
    public void delete(User obj) {

    }
}
