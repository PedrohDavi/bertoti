package classes;

import java.awt.*;
import interfaces.Component;
public class Resistor implements Component {
    private double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }
    public void displayDetails(){
        System.out.println("Resistor de " + resistance + " Ohms");
    }

}
