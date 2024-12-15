package lld.design.patterns.decoratordesign.toppings;

import lld.design.patterns.decoratordesign.Coffee;

public class ToppingImpl extends Topping{
    private Coffee coffee; 
    private float cost; 
    private String name; 
    //injecting coffee as it has "Has a" relationship with Coffee
    public ToppingImpl(Coffee coffee, float cost, String name){ 
        this.coffee = coffee;
        this.cost = cost; 
        this.name = name;  
    } 
    @Override
    public String getCoffeeTopins() {
        return coffee.getCoffeeTopins()+", "+this.name;
    }
    @Override
    public float getCost() {
        return coffee.getCost() + this.cost; 
    }
}
