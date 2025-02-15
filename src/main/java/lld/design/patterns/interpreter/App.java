package lld.design.patterns.interpreter;

import java.util.Map;

public class App { 
    public static void main(String[] args) {
        Context context = new Context(); 
        Map<Character,Integer> map = context.getMap(); 
        map.put('a', 20);
        map.put('b', 30); 
        AbstractExpression num_1 = new NumberExpression('a'); 
        AbstractExpression num_2 = new NumberExpression('b');    
        AbstractExpression addition = new AdditionExpression(num_1,num_2);
        System.out.println("Interpretation : "+ addition.interprete(context));
    }

}
