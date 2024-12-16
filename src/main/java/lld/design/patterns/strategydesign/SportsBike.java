package lld.design.patterns.strategydesign;
import lld.design.patterns.strategydesign.strategies.SpeedType;

public class SportsBike extends Vehical{
    SportsBike(){
        super(); 
    }
    //We can perform or add operation specific to this class. 
    @Override
    public void setSpeedType(SpeedType speedType) {
        this.speedType = speedType; 
    }
}
