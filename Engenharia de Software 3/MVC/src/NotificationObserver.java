import java.util.ArrayList;
import java.util.List;

public class NotificationObserver implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public NotificationObserver(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void changeState(String newState) {
        notifyObservers("Estado alterado para: " + newState);
    }

    public void setNotificationStrategy(NotificationStrategy emailStrategy) {
    }

    public void update(String message) {
    }

    public String getName() {
        return null;
    }
}
