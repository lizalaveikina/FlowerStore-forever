package ua.edu.ucu.apps.demo.orders;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderRepository {
    int count = 0;
    private final List<Order> orders = new ArrayList<>();

    public Order getId(int id) {
        return orders.get(id);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orders);
    }
    public int save(Order order) {
        order.setId(count++);
        orders.add(order);
        return order.getId();
    }
}
