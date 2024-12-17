package lld.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterCache {
    private Map<Character, CharacterClass> characterMap; 
    
    public CharacterCache(){
        characterMap = new HashMap<Character, CharacterClass>();  
    }

    //caching CharacterClass object which help us to manage memory. 
    public CharacterClass getCharacter(Character ch) {
        if(characterMap.containsKey(ch)){
            return characterMap.get(ch); 
        }else{
            String fontFamily = new String("Arial");
            Integer size = 10; 
            CharacterClass characterClass = new CharacterClass(ch, fontFamily, size); 
            characterMap.put(ch, characterClass);
            return characterClass;  
        }
    }
}
