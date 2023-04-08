package Zadatak2;

public class Rectangle {
    //attributes
    private double side_a;
    private double side_b;

    //constructor
    public Rectangle(final double side_a, final double side_b){
        this.side_a = side_a;
        this.side_b = side_b;
    }

    //getters
    public double getSide_a(){
        return this.side_a;
    }
    public double getSide_b() {
        return side_b;
    }

    //setters
    public void setSide_a(final double side_a){
        this.side_a = side_a;
    }
    public void setSide_b(final double side_b){
        this.side_b = side_b;
    }

    //methods
    public double getCircumference(){
        return (2*side_a) + (2*side_b);
    }
    public double getArea(){
        return side_a*side_b;
    }
    public boolean isSquare(){
        if (side_b == side_a){
            return true;
        }
        else {
            return false;
        }
    }

}
