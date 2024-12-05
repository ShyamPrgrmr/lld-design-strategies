package lld.design.patterns.factory;

public class Circle implements Shape{

    public Circle(){
        System.out.println("Initializing Circle");
    }

    @Override
    public String getType() {
        return "CIRCLE IS CALLED"; 
    }
}
