package lld.design.patterns.decoratordesign;

import lld.design.patterns.decoratordesign.base.Base;
import lld.design.patterns.decoratordesign.base.Bases;
import lld.design.patterns.decoratordesign.toppings.ToppingImpl;
import lld.design.patterns.decoratordesign.toppings.Toppings;

public class App {
    public static void main(String[] args) {
        Coffee cappuccino = new Base(Bases.Cappuccino.getName(),20); 
        Coffee espresso = new Base(Bases.Espresso.getName(),30); 
        Coffee latte = new Base(Bases.Latte.getName(),40);
        
        //decorating topping of mint on cappuccino. 
        Coffee mintCoffee = new ToppingImpl(cappuccino, 10,Toppings.Mint.getName());
        //getting toping and names. 
        System.out.println("\n"); 
        System.out.println("Toppings : " + mintCoffee.getCoffeeTopins());
        System.out.println("Cost : " + mintCoffee.getCost());

        //base espresso with all toppings
        Coffee espressoCoffee= new ToppingImpl(new ToppingImpl(new ToppingImpl(espresso, 10, Toppings.Mint.getName()), 20, Toppings.Nutella.getName()),60, Toppings.Cream.getName()); 
        System.out.println("\n"); 
        System.out.println("Toppings : " + espressoCoffee.getCoffeeTopins());
        System.out.println("Cost : " + espressoCoffee.getCost());


        Coffee latteCoffee= new ToppingImpl(new ToppingImpl(new ToppingImpl(latte, 10, Toppings.Mint.getName()), 20, Toppings.Nutella.getName()),60, Toppings.Cream.getName()); 
        System.out.println("\n"); 
        System.out.println("Toppings : " + latteCoffee.getCoffeeTopins());
        System.out.println("Cost : " + latteCoffee.getCost());

    }
}
