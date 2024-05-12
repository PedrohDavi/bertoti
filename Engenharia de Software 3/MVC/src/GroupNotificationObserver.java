import java.util.ArrayList;
import java.util.List;

public class GroupNotificationObserver implements Observer{

    private List<Observer> observers = new ArrayList<>();
    private String groupName;

    // Constructor
    public GroupNotificationObserver(List<Observer> observers) {
        this.observers = observers;
    }

    public void add(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void update(String message) {

    }
}
