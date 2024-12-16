package lld.design.patterns.bridge;

import lld.design.patterns.bridge.abstractions.Payment;
import lld.design.patterns.bridge.implementation.CreditCard;
import lld.design.patterns.bridge.implementation.EMV;
import lld.design.patterns.bridge.implementation.Phone;

public class App {
    public static void main(String[] args) {
        Payment phonePayment = new Phone();
        Payment creditCardPayment = new CreditCard();
        Payment emvPayment = new EMV();

        System.out.println("\n Validations : ");
        System.out.println("Phone : "+ phonePayment.isValid());
        System.out.println("CreditCard : "+ creditCardPayment.isValid());
        System.out.println("EMV : "+ emvPayment.isValid());

    }
}
