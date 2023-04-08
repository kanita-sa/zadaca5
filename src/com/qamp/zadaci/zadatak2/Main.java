package com.qamp.zadaci.zadatak2;

public class Main {
    public static void main(String[] args) {
        final Rectangle rectangle1 = new Rectangle(4.8, 1.2);
        final Rectangle rectangle2 = new Rectangle(6,6);

        System.out.println("Circumference of rectangle 1 is: " + rectangle1.getCircumference());
        System.out.println("Area of rectangle 1 is: " + rectangle1.getArea());
        System.out.println("Statement that the rectangle 1 is a square is: " + rectangle1.isSquare()+"\n");

        System.out.println("Circumference of rectangle 2 is: " + rectangle2.getCircumference());
        System.out.println("Area of rectangle 2 is: " + rectangle2.getArea());
        System.out.println("Statement that the rectangle 2 is a square is: " + rectangle2.isSquare());

    }
}
