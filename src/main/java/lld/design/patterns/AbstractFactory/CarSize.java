package lld.design.patterns.abstractfactory;

public enum CarSize {
    COMPACT("Compact Size Car"), MIDSIZE("Mid Size Car"), FULLSIZE("Full Size Car"); 
    String carSize; 
    CarSize(String carSize) {
        this.carSize = carSize; 
    }
}
