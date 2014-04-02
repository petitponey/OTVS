package Objet;

/**
 * Created by Marion on 02/04/14.
 */
public class Thumb {

    private int width;
    private int height;
    private String url;
    private Content content;

    public Thumb(int width, int height, String url, Content content) {
        this.width = width;
        this.height = height;
        this.url = url;
        this.content = content;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}

