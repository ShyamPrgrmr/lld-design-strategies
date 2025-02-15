package lld.design.patterns.interpreter;
import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Character, Integer> map; 
    public Context(){
        map = new HashMap<Character, Integer>(); 
    }
    public Map<Character,Integer> getMap(){
        return this.map; 
    }
}
