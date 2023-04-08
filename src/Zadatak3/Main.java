package Zadatak3;

public class Main {
    public static void main(String[] args) {
        final Complex complex1 = new Complex(-4, 2);
        System.out.println("Real part is: " + complex1.Re() + ", and imaginary part is: " + complex1.Im());

        final Complex complex2 = new Complex(6, -6);
        final Complex complex3 = complex1.add(complex2);
        System.out.print("Complex3 = complex1 + complex2 => ");
        complex3.printComplex();

        final Complex complex4 = new Complex(0, -9);
        System.out.print("Complex 4 is = ");
        complex4.printComplex();
        final Complex complex5 = complex3.subtract(complex4);
        System.out.print("Complex5 = complex3 - complex4 => ");
        complex5.printComplex();
    }
}
