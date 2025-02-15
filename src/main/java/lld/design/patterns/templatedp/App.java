package lld.design.patterns.templatedp;

public class App {
     
    public static void main(String[] args) {
        Payment upi = new UPI();
        upi.sendMoney("TO FRIEND");
        
        Payment creditCard = new CreditCard(); 
        creditCard.sendMoney("To Merchant");
    }
}
