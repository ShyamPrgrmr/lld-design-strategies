package lld.design.patterns.flyweight;

public class CharacterClass implements Position{
    //Intrensic data.
    private Character character;
    private String fontFamily; 
    private Integer fontSize;

    public CharacterClass(Character character, String fontFamily, Integer fontSize){
        this.character = character; 
        this.fontFamily = fontFamily; 
        this.fontSize = fontSize; 
    }

    public Character getCharacter() {
        return character;
    }
    public String getFontFamily() {
        return fontFamily;
    }
    public Integer getFontSize() {
        return fontSize;
    }

    @Override
    public void display(int x, int y) {
        System.out.printf("\nDisplayed %c on x=%d y=%d", character, x , y); 
    } 
}
