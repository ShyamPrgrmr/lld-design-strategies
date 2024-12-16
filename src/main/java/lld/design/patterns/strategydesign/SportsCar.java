package lld.design.patterns.strategydesign;
import lld.design.patterns.strategydesign.strategies.SpeedType;


public class SportsCar extends Vehical{
    public SportsCar(){
        super(); 
    }
    @Override
    public void setSpeedType(SpeedType speedType) {
        this.speedType = speedType; 
    }
}
