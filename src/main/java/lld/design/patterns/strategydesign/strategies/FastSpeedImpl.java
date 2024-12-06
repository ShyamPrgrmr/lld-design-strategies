package lld.design.patterns.strategydesign.strategies;

public class FastSpeedImpl implements SpeedType {
    private String speed; 
    public FastSpeedImpl(){
        this.speed = SpeedTypes.FAST.speedType; 
    }
    @Override
    public void setSpeed() {
        this.speed = SpeedTypes.FAST.speedType; 
    }
    @Override
    public String getSpeed() {
       return this.speed; 
    }
}
