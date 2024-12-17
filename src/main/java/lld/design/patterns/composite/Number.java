package lld.design.patterns.composite;

public class Number implements ArithmaticExpression{
    int number;
    public Number(int number){
        this.number = number; 
    }
    @Override
    public int evaluate() {
        System.out.println("Number : "+this.number);
        return this.number;
    }       
}
