package lld.design.patterns.observer;

import java.util.List;

public class StockImpl implements Stock{
    private int price; 
    private String name;
    private List<Display> displays;  

    public StockImpl(String name){
        this.price = 0;
        this.name = name;  
    }

    @Override
    public void setPrice(int price) {
        this.price = price; 
    }

    @Override
    public int getPrice() {
        return this.price; 
    }

    @Override
    public void notifyDisplay() {
        for(Display display : displays) {
            display.update();
        }
    }

    @Override
    public void add(Display display) {
        displays.add(display); 
    }

    @Override
    public String getName() {
        return name; 
    }

    @Override
    public String toString() {
        return "Name : "+this.name+", Price: "+this.price; 
    }
}
