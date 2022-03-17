package com.cgi.bootcamp.practice.shapes;

import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose the type of object to find area");
        System.out.println("\t1. Square");
        System.out.println("\t2. Rectangle");
        System.out.println("\t3. Circle");
        int option=scan.nextInt();
        if (option==1) {
            System.out.println("Enter the dimensions of the square");
            int side1 = scan.nextInt();
            int side2 = scan.nextInt();
            double area = side1*side2;
            System.out.println("The area of the square is " +area);
        }
        else if(option==2){
            System.out.println("Enter the dimensions of the rectangle");
            int width = scan.nextInt();
            int length = scan.nextInt();
            double area = width*length;
            System.out.println("The area of the rectangle is " +area);
        }
        else if (option==3) {
            System.out.println("Enter the dimensions of the circle");
            double PI = 3.142;
            int radius = scan.nextInt();
            double area = PI*radius*radius;
            System.out.println("The area of the circle is " +area);
            scan.close();
        }
    }
    /*void handleConsoleInOut() {
        System.out.println("Nachricht");
    }*/
}
