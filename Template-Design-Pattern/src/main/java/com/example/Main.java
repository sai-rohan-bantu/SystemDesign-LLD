package com.example;

import com.example.Beverages.Beverage;
import com.example.Beverages.Coffee;
import com.example.Beverages.Tea;


public class Main {
    public static void main(String[] args) {
        System.out.println("Template Design Pattern Example");
        // Create Tea beverage
        Beverage tea = new Tea();
        tea.prepareDrink();

        System.out.println();

        // Create Coffee beverage
        Beverage coffee = new Coffee();
        coffee.prepareDrink();

    }
}