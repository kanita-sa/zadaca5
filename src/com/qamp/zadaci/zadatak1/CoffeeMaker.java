package com.qamp.zadaci.zadatak1;

public class CoffeeMaker {
    private int water;
    private double coffee;
    private int milk;
    private boolean isOn;

    public CoffeeMaker(final int water, final double coffee){
        this.water = water;
        this.coffee = coffee;
    }
    public CoffeeMaker(final int water, final double coffee, final int milk){
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }
    public double getCoffee() {
        return coffee;
    }
    public int getMilk() {
        return milk;
    }
    public boolean GetIfOn() {return isOn;}

    public void setWater(final int water){
        this.water = water;
    }
    public void setCoffee(final double coffee){
        this.coffee = coffee;
    }
    public void setMilk(final int milk){
        this.milk = milk;
    }
    public void setIfOn(final boolean isOn){
        this.isOn = isOn;
    }

    public String makeEspresso(){
        if(isOn){
            this.water = this.water - 50;
            this.coffee = this.coffee - 18.5;
            return "Here is your Espresso!";
        }
        else{
            return "Please turn the Coffee Maker on";
        }
    }
    public String makeLatte(){
        if(isOn) {
            this.water = this.water - 150;
            this.coffee = this.coffee - 18.0;
            this.milk = this.milk - 50;
            return "Here is your Latte!";
        }
        else{
            return "Please turn the Coffee Maker on";
        }
    }
    public void turnOn(){
        isOn = true;
    }


}
