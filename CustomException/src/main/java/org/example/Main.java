package org.example;

public class Main {
    public static void main(String[] args) {
        PaymentService ps=new PaymentService();
        try
        {
            ps.processPayment(100);

        }
        catch(PaymentException e)
        {
            System.out.println("Payment processing failed: "+e.getMessage());
        }
    }
}