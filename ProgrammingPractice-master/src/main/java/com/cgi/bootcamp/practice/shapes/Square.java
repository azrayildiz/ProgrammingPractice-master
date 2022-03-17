package com.cgi.bootcamp.practice.shapes;

//Square
public class Square extends Infoshape {
    private double width;

    /**
     * Konstruiert ein neues Rechteck mit den angegebenen Abmessungen
     * */
    public Square(double width) {
        this.width = width;
    }

    public Square(String square, int i, int i1) {
        super();
    }
    //Gibt die Fläche des Rechtecks zurück
    public double area() {
        return width * width;
        // System.out.println("Drawing Rectangle");
    }
    //Gibt den Umfang dieses Rechtecks zurück
    public double perimeter() {
        return 4.0 * width;
    }

    @Override
    public String info() {
        return null;
    }
}

