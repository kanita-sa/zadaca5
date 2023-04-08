package Zadatak3;

public class Complex {
    //Attributes
    private int realPart;
    private int imaginaryPart;

    //Constructors
    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(final int realPart, final int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //Getters
    public int Re(){
        return this.realPart;
    }
    public int Im(){
        return this.imaginaryPart;
    }

    //Methods
    public Complex add(Complex z){
         int zOfRe = z.Re();
         int zOfIm = z.Im();
         Complex adding = new Complex(this.realPart+zOfRe, this.imaginaryPart+zOfIm);
         return adding;
    }
    public Complex subtract(Complex z){
        int zOfRe = z.Re();
        int zOfIm = z.Im();
        Complex subtracting = new Complex(this.realPart-zOfRe, this.imaginaryPart-zOfIm);
        return subtracting;
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

