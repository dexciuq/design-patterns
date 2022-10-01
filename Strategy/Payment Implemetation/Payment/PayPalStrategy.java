package Payment;

import Payment.Interface.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "$ paid by using PayPal application by email " + emailId);
    }
}
