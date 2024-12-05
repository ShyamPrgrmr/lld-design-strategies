package lld.design.patterns.factory;

//Factory has conditions to return objects based on type provided in getShape() Method. 

public class App {
    public static void main(String[] args) {
        Factory factory = new Factory(); 
        Shape cirShape = factory.getShape(ShapeTypes.CIRCLE); 
        System.out.println(cirShape.getType());
        Shape ranShape = factory.getShape(ShapeTypes.RECTANGLE); 
        System.out.println(ranShape.getType());
    }
}
