package lld.design.patterns.factory;

public class Rectangle implements Shape{
    public Rectangle(){
        System.out.println("Initializing Rectangle");
    }
    
    @Override
    public String getType() {
        return "RECTANGLE TYPE IS CALLED"; 
    }
}
