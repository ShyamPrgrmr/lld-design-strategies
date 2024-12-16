package lld.design.patterns.bridge.implementation.strategies;
import lld.design.patterns.bridge.abstractions.PaymentStrategy;

public class MasterCard implements PaymentStrategy {
    @Override
    public boolean isValid(String payInfo) {
        //some logic with payInfo
        System.out.println("MasterCard " + payInfo);
        return false;
    }
}
