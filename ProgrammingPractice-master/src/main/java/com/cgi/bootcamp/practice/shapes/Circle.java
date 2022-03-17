package com.cgi.bootcamp.practice.shapes;

//Circle
public class Circle extends Infoshape {

    private double radius;

    //Konstruiert einen neuen Kreis mit dem angegebenen Radius
    public Circle(double radius) {
        this.radius = radius;
    }

    //Gibt die Fläche des Kreises zurück
    public double area() {
        return Math.PI * radius * radius;
        // System.out.println("Drawing Circle");
    }

    //Gibt den Umfang des Kreises zurück
    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public String info() {
        return null;
    }
}
