package classes;

import java.awt.*;
import interfaces.Component;
public class Capacitor implements Component {
    private double capacitance;
    public Capacitor(double capacitance) {
        this.capacitance = capacitance;
    }

    public void displayDetails(){
        System.out.println("Capacitância de " + capacitance + " Farads");
    }


}
