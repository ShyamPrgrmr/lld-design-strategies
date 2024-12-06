package lld.design.patterns.strategydesign;
import lld.design.patterns.strategydesign.strategies.FastSpeedImpl;

public class SportsBike extends Vehical{
    SportsBike(){
        super(new FastSpeedImpl()); 
    }
}
