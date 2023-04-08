package com.qamp.zadaci.zadatak3;

public class Complex {
    private int realPart;
    private int imaginaryPart;

    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(final int realPart, final int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public int Re(){
        return this.realPart;
    }
    public int Im(){
        return this.imaginaryPart;
    }

    public Complex add(Complex z){
         return new Complex(this.realPart+z.Re(), this.imaginaryPart+z.Im());
    }
    public Complex subtract(Complex z){
        return new Complex(this.realPart-z.Re(), this.imaginaryPart-z.Im());
    }

    public void printComplex(){
        if(realPart != 0 && imaginaryPart == 0){
            System.out.println(this.realPart);
        }
        else if(realPart == 0 && imaginaryPart != 0){
            System.out.println(this.imaginaryPart + "i");
        }
        else if(realPart == 0 && imaginaryPart == 0){
            System.out.println("0");
        }
        else if(realPart != 0 && imaginaryPart != 0){
            System.out.println(this.realPart + " + " + imaginaryPart + "i");
        }
    }
}

