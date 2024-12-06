package lld.design.patterns.decoratordesign.base;

import lld.design.patterns.decoratordesign.Coffee;

public class Base extends Coffee{
    private float cost; 
    private String name; 

    public Base(String name, float cost){
        this.name = name; 
        this.cost=cost; 
    }

    @Override
    public float getCost() {
        return cost; 
    }

    @Override
    public String getCoffeeTopins() {
        return name; 
    }
    
}
