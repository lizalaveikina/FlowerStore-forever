package ua.edu.ucu.apps.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        System.out.println("PayPal method");
        return price;
    }

}
