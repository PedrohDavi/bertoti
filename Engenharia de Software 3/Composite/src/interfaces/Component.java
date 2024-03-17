package interfaces;

public interface Component {

     void displayDetails();

    default double calculateCost() {
        return 0;
    }

    default boolean containsComponent(Component component) {
        return false;
    }

    default public void addComponent(Component component) {

    }

    default public void removeComponent(Component component) {

    }
}
