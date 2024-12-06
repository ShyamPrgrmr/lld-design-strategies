package lld.design.patterns.strategydesign;

import lld.design.patterns.strategydesign.strategies.SpeedType;

public class Vehical {
    protected SpeedType speedType;
    protected String carName; 
    protected Vehical(SpeedType speed){
        this.speedType = speed; 
    }
    public void setCarName(String carName){
        this.carName = carName; 
    }
    public String getCarName(){
        return this.carName; 
    }
    public SpeedType getCarSpeed(){
        return this.speedType; 
    }
}
