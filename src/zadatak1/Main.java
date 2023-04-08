package zadatak1;

public class Main {
    public static void main(String[] args) {

        final CoffeeMaker drink1 = new CoffeeMaker(500, 200);
        drink1.setOn();
        System.out.println(drink1.makeEspresso());
        System.out.println("Water left: " + drink1.getWater() + "ml");
        System.out.println("Coffee left: " + drink1.getCoffee() + "g" + "\n");

        final CoffeeMaker drink2 = new CoffeeMaker(drink1.getWater(), drink1.getCoffee(), 100);
        drink2.setOn();
        System.out.println(drink2.makeLatte());
        System.out.println("Water left: " + drink2.getWater() + "ml");
        System.out.println("Coffee left: " + drink2.getCoffee() + "g");
        System.out.println("Milk left: " + drink2.getMilk() + "ml" + "\n");

        final CoffeeMaker drink3 = new CoffeeMaker(drink2.getWater(), drink2.getCoffee());
        System.out.println(drink3.makeEspresso());
    }
}
