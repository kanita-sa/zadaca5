package com.qamp.zadaci.zadatak2;

public class Rectangle {
    private double side_a;
    private double side_b;

    public Rectangle(final double side_a, final double side_b){
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double getSide_a(){
        return this.side_a;
    }
    public double getSide_b() {
        return side_b;
    }

    public void setSide_a(final double side_a){
        this.side_a = side_a;
    }
    public void setSide_b(final double side_b){
        this.side_b = side_b;
    }

    public double getCircumference(){
        return (2*side_a) + (2*side_b);
    }
    public double getArea(){
        return side_a*side_b;
    }
    public boolean isSquare(){
        return side_b == side_a;
    }

}
