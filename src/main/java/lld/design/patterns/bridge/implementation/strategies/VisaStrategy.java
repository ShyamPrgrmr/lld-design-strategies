package lld.design.patterns.bridge.implementation.strategies;

import lld.design.patterns.bridge.abstractions.PaymentStrategy;

public class VisaStrategy implements PaymentStrategy {
    @Override
    public boolean isValid(String payInfo) {
        //some logic with payInfo
        System.out.println("VisaCard " + payInfo);
        return true;
    }
}
