package lld.design.patterns.templatedp;

public class UPI  extends Payment{

    private final String NAME = "UPI"; 

    @Override
    protected void compute(String payment) {
        System.out.println("Compute called for "+payment+" in "+NAME);
    }

    @Override
    protected void credit(String payment) {
        System.out.println("Compute called for "+payment+" in "+NAME);
    }

    @Override
    protected void debit(String payment) {
        System.out.println("Debit called for "+payment+" in "+NAME);
    }

    @Override
    protected void verify(String payment) {
        System.out.println("Verify called for "+payment+" in "+NAME);
    }
    
}
