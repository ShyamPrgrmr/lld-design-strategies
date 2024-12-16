package lld.design.patterns.bridge.implementation;

import lld.design.patterns.bridge.abstractions.Payment;
import lld.design.patterns.bridge.implementation.strategies.MasterCard;

public class CreditCard extends Payment{
    public CreditCard(){
        super(new MasterCard()); 
    }
    @Override
    public boolean isValid() {
        return this.paymentStrategy.isValid("CREDIT_CARD");
    }
}
