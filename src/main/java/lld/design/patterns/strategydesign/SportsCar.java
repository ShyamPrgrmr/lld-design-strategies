package lld.design.patterns.strategydesign;
import lld.design.patterns.strategydesign.strategies.SuperFastImpl;
public class SportsCar extends Vehical{
    public SportsCar(){
        super(new SuperFastImpl()); 
    }
}
