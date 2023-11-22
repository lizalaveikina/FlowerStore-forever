package ua.edu.ucu.apps.demo.flowers;

import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.payment.Payment;

import java.util.List;

public class Order {
    private Payment payment;
    private Delivery delivery;
    private List<Item> ordered;

    public Order(List<Item> items) {
        this.ordered = items;
    }

    public void setPaymentMethod(Payment chosenPayment) {
        this.payment = chosenPayment;
    }

    public void setDeliverStrategy(Delivery chosenDelivery) {
        this.delivery = chosenDelivery;
    }

    public double countPrice() {
        return ordered.stream().mapToDouble(Item::price).sum();
    }

    public void processingOrder() {
        if (this.payment.pay(countPrice()) == countPrice()) {
            System.out.println("Payed");
            this.delivery.deliver(this.ordered);
            System.out.println("Delivered");
        }
    }

    public void addItem(Item item) {
        ordered.add(item);
    }

    public void deleteItem(Item item) {
        ordered.remove(item);
    }
}
