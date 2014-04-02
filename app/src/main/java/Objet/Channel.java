package Objet;

/**
 * Created by Marion on 02/04/14.
 */

import java.util.LinkedList;

/**
 * Cette classe permet de gérer un chaine
 */
public class Channel {

    private String label;
    private String id;
    private boolean visibility;
    private String description;
    private LinkedList<User> admins;
    private LinkedList<User> members;
    private LinkedList<Content> contents;

    public Channel(String label, boolean visibility, String description) {
        this.label = label;
        this.visibility = visibility;
        this.description = description;
        this.admins = new LinkedList<User>();
        this.members = new LinkedList<User>();
        this.contents = new LinkedList<Content>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<User> getAdmins() {
        return admins;
    }

    public void setAdmins(LinkedList<User> admins) {
        this.admins = admins;
    }

    public LinkedList<User> getMembers() {
        return members;
    }

    public void setMembers(LinkedList<User> members) {
        this.members = members;
    }
}
