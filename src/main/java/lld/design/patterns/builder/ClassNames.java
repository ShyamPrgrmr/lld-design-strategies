package lld.design.patterns.builder;

public enum ClassNames {
    FIRST_YEAR("First Year"), 
    SECOND_YEAR("Second Year"),
    THIRD_YEAR("Third Year"),
    FOURTH_YEAR("Fourth Year"); 

    String className;
    private ClassNames(String className){
        this.className = className; 
    }
}
