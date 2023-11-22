package ua.edu.ucu.apps.demo.decorator;

import ua.edu.ucu.apps.demo.flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    public double price() {
        return super.price() + 40;
    }

    public String getDescription() {
        return "Decorated in ribbon: " +super.getDescription();
    }
}
