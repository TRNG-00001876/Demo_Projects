package org.example;

//Custom exception for payment related errors

public class PaymentException extends Exception{
    public PaymentException(String message){
        super(message);
    }
}
