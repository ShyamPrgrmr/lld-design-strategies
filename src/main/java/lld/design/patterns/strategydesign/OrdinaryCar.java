package lld.design.patterns.strategydesign;
import lld.design.patterns.strategydesign.strategies.SpeedType;

public class OrdinaryCar extends Vehical{
    public OrdinaryCar(){
        super();
    }
    @Override
    public void setSpeedType(SpeedType speedType) {
        this.speedType = speedType; 
    }
}
