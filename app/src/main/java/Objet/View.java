package Objet;

/**
 * Created by Marion on 02/04/14.
 */

import java.util.Date;
import java.util.LinkedList;

/**
 * Cette classe permet de gérer une vue
 */
public class View {

    private String id;
    private Date date;
    private Content content;
    private User users;

    public View(Date date, Content content, User users) {
        this.date = date;
        this.content = content;
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}
