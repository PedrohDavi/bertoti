package interfaces;

public interface ISubject {
    void subscribe(IObserver observer);
    void unsubscribe(IObserver observer);
    void unsubscribeAll();
    void notify(IObserver observer);
    void notifyyAll();
}