package com.cgi.bootcamp.practice.shapes;

public interface ShapeInterface<shapes> {
    public double area();
    public double perimeter();
    String info();
    default String name() {
        return null;
    }
}



