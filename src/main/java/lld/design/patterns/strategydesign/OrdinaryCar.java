package lld.design.patterns.strategydesign;

import lld.design.patterns.strategydesign.strategies.MediumSpeedImpl;

public class OrdinaryCar extends Vehical{
    public OrdinaryCar(){
        super(new MediumSpeedImpl());
    }
}
