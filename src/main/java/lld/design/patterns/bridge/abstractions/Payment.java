package lld.design.patterns.bridge.abstractions;

public abstract class Payment {
    protected PaymentStrategy paymentStrategy; 
    public Payment(PaymentStrategy paymentStrategy){ 
        this.paymentStrategy = paymentStrategy;
    }
    public abstract boolean isValid(); 
}
