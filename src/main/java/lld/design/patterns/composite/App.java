package lld.design.patterns.composite;

// Evaluate 2+(3-1)
public class App {
    public static void main(String[] args) {
        ArithmaticExpression number_2 = new Number(2);
        ArithmaticExpression number_3 = new Number(3);
        ArithmaticExpression number_1 = new Number(1);
        
        ArithmaticExpression sub = new Operator(number_3, number_1, Operations.SUBSTRACT); 
        ArithmaticExpression add = new Operator(number_2, sub, Operations.ADD);
        
        int result = add.evaluate();
        
        System.out.println("Evaluation : "+result);

    }
}
