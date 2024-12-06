package lld.design.patterns.decoratordesign.toppings;

public enum Toppings {
    Mint("Mint"), Cream("Cream"), Nutella("Nutella"); 
    private String name; 
    Toppings(String name) {
        this.name = name; 
    }
    public String getName(){
        return this.name; 
    }
}
