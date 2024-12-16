package lld.design.patterns.bridge.implementation;

import lld.design.patterns.bridge.abstractions.Payment;
import lld.design.patterns.bridge.implementation.strategies.VisaStrategy;

public class Phone extends Payment{

    //Setting strategy for Phone. 
    public Phone(){
        super(new VisaStrategy()); 
    }

    //Using decoupled implementations. 
    @Override
    public boolean isValid() {
        //can perform some operation
        return this.paymentStrategy.isValid("PHONE");
    }
}
