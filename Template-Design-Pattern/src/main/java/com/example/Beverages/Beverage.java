package com.example.Beverages;

public abstract class Beverage {
     public final void prepareDrink(){
        boilWater();
        brew();
        pourInCup();
         if(customerWantsCondiments()){
             addCondiments();
         }
    }
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    abstract void brew();
    abstract void addCondiments();

    boolean customerWantsCondiments(){
        return true;
    }

}
