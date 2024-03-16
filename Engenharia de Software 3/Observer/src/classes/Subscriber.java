package classes;
import interfaces.IObserver;

public class Subscriber implements IObserver {
    private final int id;
    private final String name;

    public Subscriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(Video video) {
        System.out.println(name + " has been notified about " + video.getTitle());
    }
}