package Objet;

/**
 * Created by Marion on 02/04/14.
 */

import java.util.LinkedList;

/**
 * Cette classe permet de gérer une catégorie
 */
public class Category {

    private String id;
    private LinkedList<Content> contents;
    private String label;

    public Category(String label) {
        this.contents = new LinkedList<Content>();
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedList<Content> getContents() {
        return contents;
    }

    public void setContents(LinkedList<Content> contents) {
        this.contents = contents;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
