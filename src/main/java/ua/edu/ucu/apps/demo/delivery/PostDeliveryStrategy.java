package ua.edu.ucu.apps.demo.delivery;

import java.util.List;

import ua.edu.ucu.apps.demo.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("Delivered by post");
        return items;
    }
}