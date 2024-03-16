package classes;

public class Video {

    private final char id;
    private final String title;

    private final String thumbnail;

    private final String link;

    public String getTitle() {
        return title;
    }

    public Video(char id, String title, String thumbnail, String link) {
        this.id = id;
        this.title = title;
        this.thumbnail = thumbnail;
        this.link = link;
    }

}
