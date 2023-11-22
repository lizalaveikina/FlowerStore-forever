package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;

class PaymentTest {
    private PayPalPaymentStrategy payPalPayment;
    private CreditCardPaymentStrategy creditCardPayment;
    private final double price = 100;

    @BeforeEach
    public void init() {
        payPalPayment = new PayPalPaymentStrategy();
        creditCardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testCreditCard() {
        Assertions.assertEquals(price, creditCardPayment.pay(price));
    }

    @Test
    public void testPayPal() {
        Assertions.assertEquals(price, payPalPayment.pay(price));
    }
}