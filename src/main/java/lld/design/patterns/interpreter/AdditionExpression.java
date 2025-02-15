package lld.design.patterns.interpreter;

public class AdditionExpression implements AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;
    public AdditionExpression(AbstractExpression left, AbstractExpression right){
        this.left   = left;
        this.right  = right; 
    }
    @Override
    public Integer interprete(Context context) {
        return(left.interprete(context) + right.interprete(context)); 
    }
}
