package lld.design.patterns.strategydesign.strategies;

public class SlowSpeedImpl implements SpeedType{
    String speed; 
    public SlowSpeedImpl(){
        this.speed = SpeedTypes.SLOW.speedType; 
    }
    @Override
    public void setSpeed() {
        this.speed = SpeedTypes.SLOW.speedType; 
    }
    @Override
    public String getSpeed() {
        return this.speed;         
    }

}
