package lld.design.patterns.bridge.implementation;

import lld.design.patterns.bridge.abstractions.Payment;
import lld.design.patterns.bridge.implementation.strategies.MasterCard;

public class EMV extends Payment{
    public EMV(){
        super(new MasterCard()); 
    }
    @Override
    public boolean isValid() {
        return this.paymentStrategy.isValid("EMV");
    }
}
