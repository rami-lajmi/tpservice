package com.rami.lajmi;

import java.util.Set;

public abstract class Da {
        public abstract User getUser();
        public abstract Article getArticle();
        public abstract Set<Article> getAllArticles();
        public abstract Set<User> getAllUsers();
        public abstract User getUserById();
        public abstract Article getArticleByAuthor();

        public abstract boolean insertUser();
        public abstract boolean insertArticle();

        public abstract boolean updateUser();
        public abstract boolean updateArticle();

        public abstract boolean deleteUser();
        public abstract boolean deleteArticle();


}
