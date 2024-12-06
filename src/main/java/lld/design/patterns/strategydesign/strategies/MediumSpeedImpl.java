package lld.design.patterns.strategydesign.strategies;

public class MediumSpeedImpl implements SpeedType {
    String speed;
    public MediumSpeedImpl(){
        this.speed = SpeedTypes.MEDIUM.speedType; 
    }
    @Override
    public void setSpeed() {
        this.speed = SpeedTypes.MEDIUM.speedType; 
    }
    @Override
    public String getSpeed() {
        return this.speed; 
    } 
}
