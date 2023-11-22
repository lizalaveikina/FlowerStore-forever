package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.decorator.PaperDecorator;
import ua.edu.ucu.apps.demo.decorator.RibbonDecorator;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.Item;

class DecoratorTest {

    @Test
    public void configSuccess() {
        Item tree = new PaperDecorator(new Flower());
        Assertions.assertEquals(tree.getDescription(),
                "Flower in paper");

        Item treeNew = new RibbonDecorator(new PaperDecorator(
            new PaperDecorator(new Flower())));
        Assertions.assertEquals(treeNew.getDescription(),
                "Flower in paper in paper in ribbon");
    }

}
