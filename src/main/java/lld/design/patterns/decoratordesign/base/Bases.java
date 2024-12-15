package lld.design.patterns.decoratordesign.base;

public enum Bases {
    Cappuccino("Cappuccino"), Latte("Latte"), Espresso("Espresso");
    private String name; 
    Bases(String name) {
        this.name = name; 
    } 
    public String getName(){
        return this.name; 
    }
}
