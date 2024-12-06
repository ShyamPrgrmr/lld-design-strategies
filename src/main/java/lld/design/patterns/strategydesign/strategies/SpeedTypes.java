package lld.design.patterns.strategydesign.strategies;

public enum SpeedTypes {
    FAST("Fast Speed"), SLOW("Slow Speed"), MEDIUM("Medium Speed"), SUPERFAST("Superfast Speed"); 
    String speedType; 
    SpeedTypes(String speedType){
        this.speedType = speedType; 
    }
}
