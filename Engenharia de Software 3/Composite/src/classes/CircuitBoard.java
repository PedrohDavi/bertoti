package classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.Component;

public class CircuitBoard implements Component {

    private List <Component> components = new ArrayList<>() {
    };
    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void displayDetails() {
        System.out.println("Circuit Board Components:");
        for (Component component : components) component.displayDetails();
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Component component : components) {
            totalCost += component.calculateCost();
        }
        return totalCost;
    }
    public boolean containsComponent(Component component) {
        return components.contains(component);
    }
}
