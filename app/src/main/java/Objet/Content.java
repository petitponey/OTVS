package Objet;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by Marion on 02/04/14.
 */
public class Content {

    private String id;
    private LinkedList<File> file;
    private String title;
    private String description;
    private LinkedList<Tag> tags;
    private boolean internal;
    private boolean listed;
    private boolean downloadable;
    private User  uploader;
    private Category category;
    private Channel channel;
    private Date date;
    private Double duration;
    private String type;
    private int encoding;
    private boolean approuved;
    private LinkedList<View> views;
    private LinkedList<Like> likes;
    private LinkedList<Comment> comments;
    private LinkedList<VideoMessage> videoMessages;
    private LinkedList<Thumb> thumbs;

    public Content(LinkedList<File> file, String title, String description, boolean internal, boolean listed, boolean downloadable, User uploader, Category category, Channel channel, Date date, Double duration, String type, int encoding, boolean approuved) {
        this.id = id;
        this.file = file;
        this.title = title;
        this.description = description;
        this.tags = new LinkedList<Tag>();
        this.internal = internal;
        this.listed = listed;
        this.downloadable = downloadable;
        this.uploader = uploader;
        this.category = category;
        this.channel = channel;
        this.date = date;
        this.duration = duration;
        this.type = type;
        this.encoding = encoding;
        this.approuved = approuved;
        views = new LinkedList<View>();
        likes = new LinkedList<Like>();
        comments = new LinkedList<Comment>();
        videoMessages = new LinkedList<VideoMessage>();
        thumbs = new LinkedList<Thumb>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedList<File> getFile() {
        return file;
    }

    public void setFile(LinkedList<File> file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<Tag> getTags() {
        return tags;
    }

    public void setTags(LinkedList<Tag> tags) {
        this.tags = tags;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public boolean isListed() {
        return listed;
    }

    public void setListed(boolean listed) {
        this.listed = listed;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public User getUploader() {
        return uploader;
    }

    public void setUploader(User uploader) {
        this.uploader = uploader;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(int encoding) {
        this.encoding = encoding;
    }

    public boolean isApprouved() {
        return approuved;
    }

    public void setApprouved(boolean approuved) {
        this.approuved = approuved;
    }

    public LinkedList<View> getViews() {
        return views;
    }

    public void setViews(LinkedList<View> views) {
        this.views = views;
    }

    public LinkedList<Like> getLikes() {
        return likes;
    }

    public void setLikes(LinkedList<Like> likes) {
        this.likes = likes;
    }

    public LinkedList<Comment> getComments() {
        return comments;
    }

    public void setComments(LinkedList<Comment> comments) {
        this.comments = comments;
    }

    public LinkedList<VideoMessage> getVideoMessages() {
        return videoMessages;
    }

    public void setVideoMessages(LinkedList<VideoMessage> videoMessages) {
        this.videoMessages = videoMessages;
    }

    public LinkedList<Thumb> getThumbs() {
        return thumbs;
    }

    public void setThumbs(LinkedList<Thumb> thumbs) {
        this.thumbs = thumbs;
    }
}
