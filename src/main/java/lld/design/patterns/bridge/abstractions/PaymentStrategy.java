package lld.design.patterns.bridge.abstractions;

//isValid implemetation will be completely decoupled from Payment. 
public interface PaymentStrategy {
    public boolean isValid(String payInfo); 
}
