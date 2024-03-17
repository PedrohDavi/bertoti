package classes;

import interfaces.Component;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creating individual components
        Resistor resistor1 = new Resistor(100);
        Resistor resistor2 = new Resistor(200);
        Resistor resistor3 = new Resistor(560);
        Capacitor capacitor1 = new Capacitor(0.4);
        Capacitor capacitor2 = new Capacitor(0.7);
        Capacitor capacitor3 = new Capacitor(0.3);
        Capacitor capacitor4 = new Capacitor(0.9);

        // Creating a circuit board and adding components to it
        CircuitBoard circuitBoard = new CircuitBoard();
        circuitBoard.addComponent(resistor1);
        circuitBoard.addComponent(resistor2);
        circuitBoard.addComponent(resistor3);
        circuitBoard.addComponent(resistor3);
        circuitBoard.addComponent(capacitor1);
        circuitBoard.addComponent(capacitor2);
        circuitBoard.addComponent(capacitor3);
        circuitBoard.addComponent(capacitor4);

        circuitBoard.removeComponent(capacitor3);
        circuitBoard.removeComponent(resistor1);

        // Displaying the circuit board components
        circuitBoard.displayDetails();

        System.out.println("Resistor1 está presente? " + circuitBoard.containsComponent(resistor1));
        System.out.println("Resistor1 está presente? " + circuitBoard.containsComponent(resistor3));
        System.out.println("Resistor1 está presente? " + circuitBoard.containsComponent(capacitor3));
        System.out.println("Resistor1 está presente? " + circuitBoard.containsComponent(capacitor1));
    }
}