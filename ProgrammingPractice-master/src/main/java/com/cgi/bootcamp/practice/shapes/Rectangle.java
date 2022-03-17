package com.cgi.bootcamp.practice.shapes;

// Rectangle
public class Rectangle extends Infoshape {
/// cannot access outside of this class.
    private double width;
    private double height;

    //Konstruiert ein neues Rechteck mit den angegebenen Abmessungen
    public Rectangle(String rect, double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Gibt die Fläche des Rechtecks zurück
    public double area() {
        return width * height;
        // System.out.println("Drawing Rectangle");
    }

    //Gibt den Umfang dieses Rechtecks zurück
    public double perimeter() {
        return 2.0 * width + 2 * height;
    }

    @Override
    public String info() {
        return null;
    }
}
