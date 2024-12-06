package lld.design.patterns.strategydesign.strategies;

public class SuperFastImpl implements SpeedType {
    String speed;
    public SuperFastImpl(){
        this.speed = SpeedTypes.SUPERFAST.speedType; 
    }
    @Override
    public void setSpeed() {
        this.speed = SpeedTypes.SUPERFAST.speedType; 
    }
    @Override
    public String getSpeed() {
        return this.speed; 
    }
    
}
