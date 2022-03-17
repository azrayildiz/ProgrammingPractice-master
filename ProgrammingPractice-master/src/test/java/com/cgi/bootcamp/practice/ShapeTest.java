package com.cgi.bootcamp.practice;

import com.cgi.bootcamp.practice.shapes.*;

public class ShapeTest {
    public static void main(String[] args) {

        //programming for interfaces not implementation
        ShapeInterface shapes = new Infoshape() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }

            @Override
            public String info() {
                return null;
            }
        };

        Rectangle[] shape = new Rectangle[0];
        shape[0] = new Rectangle("rect", 10,20);
        //shape[1] = new Rectangle("square", 30,30);
        //shapes[2] = new Circle();

    }
}

