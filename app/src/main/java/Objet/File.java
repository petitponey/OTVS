package Objet;

/**
 * Created by Marion on 02/04/14.
 */

/**
 *
 */

public class File {

    private String url;
    private int bitrate; //debit
    private int width;
    private int height;
    private String mime;// = extension du fichier

    public File(String url, int bitrate, int width, int height, String mime) {
        this.url = url;
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.mime = mime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
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

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }
}
