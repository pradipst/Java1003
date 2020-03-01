package com.cognizant.shapes;

import java.util.Scanner;

public class Shapes {
    public static void main (String[] args) {

        System.out.println ("How many Side?");
        int numberOfSide= new Scanner (System.in).nextInt ();

        //int numberOfSide = Integer.parseInt (scanner.nextLine ());//

        if (numberOfSide == 1) {
            Circle circle = new Circle(4);
            circle.getArea1 ();
            System.out.println ("The Area of the circle is " + circle.getArea1 ());


        } else if (numberOfSide == 3) {
            Triangle triangle = new Triangle (10);
            triangle.getArea2 ();
            System.out.println ("The Area of the triangle is " + triangle.getArea2 ());


        } else if (numberOfSide == 4) {
            Square square = new Square (15);
            square.getArea3 ();
            System.out.println ("The Area of the Square is " + square.getArea3 ());


        } else {
            System.out.println ("No Shapes Present");
        }

    }
     static class Circle {
        double pi = 3.14;
        double radius;

       Circle (double radius) {
            this.radius = radius;

       }

        double getArea1 () {

           return pi * radius * radius;
        }
    }

    static class Triangle {
        double length;

        Triangle (double length) {
          this.length = length;

        }

        double getArea2 () {
            return 0.433 * length * length;

        }
    }

    static class Square {
        int length;

        Square (int length) {

            this.length = length;
        }

        int getArea3 () {
            return length * length;

        }
    }

}







