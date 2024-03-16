package classes;

import interfaces.IObserver;

public class Feed implements IObserver {
    public String url;
    private final String channelId;

    public Feed(String channelId) {
        this.channelId = channelId;
        this.url = "https://www.youtube.com/feeds/videos.xml?channel_id=" + this.channelId;
    }

    public void update(Video video) {
        System.out.println("New video added in Feed RSS: \"" + video.getTitle() + "\"");
        System.out.println("Check this out : \"" + this.url + "\"");
    }
}
