package classes;

import interfaces.IObserver;
import interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class VideoNotification implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private final Video video;

    public VideoNotification(Video video) {
        this.video = video;
    }


    public void subscribe(IObserver sub) {
        observers.add(sub);
    }


    public void unsubscribe(IObserver sub) {
        observers.remove(sub);
    }

    public void unsubscribeAll() {
        observers.clear();
    }

    public void notify(IObserver sub) {
        sub.update(video);
    }

    public void notifyyAll() {
        for (IObserver sub : observers) {
            notify(sub);
        }
    }
}