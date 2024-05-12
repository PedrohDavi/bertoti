import java.util.ArrayList;
import java.util.List;

public class CompositeObserver implements Observer {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void update(String message) {

    }
}