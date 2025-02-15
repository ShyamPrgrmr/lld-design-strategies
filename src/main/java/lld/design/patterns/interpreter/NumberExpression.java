package lld.design.patterns.interpreter;

public class NumberExpression implements AbstractExpression{
    private Character key; 
    public NumberExpression(Character key){
        this.key = key; 
    }
    @Override
    public Integer interprete(Context context) {
        return context.getMap().get(this.key); 
    }
}
