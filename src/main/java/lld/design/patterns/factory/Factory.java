package lld.design.patterns.factory;

public class Factory {
    public Shape getShape(ShapeTypes type){
        switch (type) {
            case CIRCLE:
                return new Circle(); 
            case RECTANGLE:
                return new Rectangle(); 
            default:
                return null; 
        }
    }
}
