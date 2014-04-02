package Objet;

/**
 * Created by Marion on 02/04/14.
 */

/**
 * Cette classe permet de gérer un message vidéo
 */

public class VideoMessage {

    private Content content;
    private User user;
    private int read;
    private String id;

    public VideoMessage(Content content, User user, int read) {
        this.content = content;
        this.user = user;
        this.read = read;
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

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
