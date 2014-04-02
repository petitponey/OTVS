package Objet;

import java.util.*;

/**
 * Created by Marion on 02/04/14.
 */

/**
 * Cette classe permet de gérer un commentaire
 */
public class Comment {

    private int id;
    private Content content;
    private User user;
    private Date date;
    private String text;

    public Comment(Content content, User user, String text) {
        this.content = content;
        this.user = user;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
