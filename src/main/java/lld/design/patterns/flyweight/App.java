package lld.design.patterns.flyweight;

public class App {
    public static void main(String[] args) {
        
        CharacterCache cache = new CharacterCache(); 
        
        CharacterClass char1 = cache.getCharacter('s');
        char1.display(0, 0);
        
        CharacterClass char2 = cache.getCharacter('h');
        char2.display(1, 0);

        CharacterClass char3 = cache.getCharacter('y');
        char3.display(2, 0);

        CharacterClass char4 = cache.getCharacter('a');
        char4.display(3, 0);

        CharacterClass char5 = cache.getCharacter('m');
        char5.display(4, 0);
    }
}
