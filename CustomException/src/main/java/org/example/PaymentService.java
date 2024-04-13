package org.example;
//PaymentService class responsible for processing payments
public class PaymentService {
    public void processPayment(double amount) throws PaymentException{
        if (amount <=0)
        {
            //throw a custom PaymentException for invalid paymnet amount
            throw new PaymentException("Invalid payment amount: "+amount);
        }
    }
}
