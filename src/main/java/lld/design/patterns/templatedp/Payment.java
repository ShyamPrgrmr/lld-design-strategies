package lld.design.patterns.templatedp;

public abstract class Payment {

    protected abstract void verify(String payment);
    protected abstract void debit(String payment);
    protected abstract void credit(String payment); 
    protected abstract void compute(String payment); 

    public void sendMoney(String payment){
        verify(payment);
        debit(payment);
        credit(payment);
        compute(payment);
    }

}
