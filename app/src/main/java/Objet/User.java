package Objet;

/**
 * Created by Marion on 02/04/14.
 */

import android.provider.MediaStore;

import java.util.Date;
import java.util.LinkedList;

/**
 * Cette classe permet de gérer un utilisateur
 */
public class User {

    private String id;
    private String email;
    private String acl;
    private String firstname;
    private String lastname;
    private String key;
    private String avatarFile;
    private boolean approved;
    private LinkedList<Content> contents;
    private LinkedList<View> views;
    private LinkedList<Like> likes;
    private LinkedList<Comment> comments;
    private LinkedList<Channel> channels;
    private LinkedList<VideoMessage> videoMessages;
    private Date date;

    public User(String email, String acl, String firstname, String lastname, String key, String avatarFile, boolean approved, Date date) {
        this.email = email;
        this.acl = acl;
        this.firstname = firstname;
        this.lastname = lastname;
        this.key = key;
        this.avatarFile = avatarFile;
        this.approved = approved;
        this.date = date;
        this.contents = new LinkedList<Content>();
        this.views = new LinkedList<View>();
        this.likes = new LinkedList<Like>();
        this.comments = new LinkedList<Comment>();
        this.channels = new LinkedList<Channel>();
        this.videoMessages = new LinkedList<VideoMessage>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAvatarFile() {
        return avatarFile;
    }

    public void setAvatarFile(String avatarFile) {
        this.avatarFile = avatarFile;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
