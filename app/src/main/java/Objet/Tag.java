package Objet;

/**
 * Created by Marion on 02/04/14.
 */

/**
 * Cette classe permet de gérer un tag
 */
public class Tag {

    private String label;
    private String id;
    private Content content;

    public Tag(String label, String id, Content content) {
        this.label = label;
        this.id = id;
        this.content = content;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
