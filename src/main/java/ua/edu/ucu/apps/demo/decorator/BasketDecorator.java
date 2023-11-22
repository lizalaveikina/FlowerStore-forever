package ua.edu.ucu.apps.demo.decorator;

import ua.edu.ucu.apps.demo.flowers.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() + 4;
    }

    public String getDescription() {
        return super.getDescription() + " in basket";
    }
}
