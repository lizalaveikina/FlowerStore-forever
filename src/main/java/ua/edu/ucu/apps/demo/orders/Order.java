package ua.edu.ucu.apps.demo.orders;

import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flowers.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.user.UserInterface;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter

public class Order {
    private Payment payment;
    private Delivery delivery;
    private List<Item> ordered;
    private int id;
    private List<UserInterface> users;

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

    public void notify(String info) {
        for (UserInterface user: users) {
            user.update(info);
        }
    }

    public String processingOrder() {
        if (this.payment.pay(countPrice()) == countPrice()) {
            System.out.println("Payed");
            this.delivery.deliver(this.ordered);
            System.out.println("Delivered");
        }
        return "Payed" + ", " + "delivered";
    }

    public void addItem(Item item) {
        ordered.add(item);
    }

    public void deleteItem(Item item) {
        ordered.remove(item);
    }

}


