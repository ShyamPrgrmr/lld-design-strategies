package lld.design.patterns.composite;

public class Operator implements ArithmaticExpression{
    private ArithmaticExpression left; 
    private ArithmaticExpression right; 
    private Operations operation; 

    public Operator(ArithmaticExpression left, ArithmaticExpression right, Operations operation){
        this.left = left; 
        this.right = right;
        this.operation = operation;  
    }

    @Override
    public int evaluate() {
        switch (operation) {
            case ADD:{
                return left.evaluate() + right.evaluate(); 
            }
            case SUBSTRACT:{
                return left.evaluate() - right.evaluate(); 
            }
            case MULTIPLY:{
                return left.evaluate() * right.evaluate(); 
            }
            case DIVIDE:{
                return left.evaluate() / right.evaluate(); 
            }
            default:{
                return left.evaluate(); 
            }
        }
    }
    
}
