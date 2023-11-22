package ua.edu.ucu.apps.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public String info(int id) {
        Order order = orderRepository.getId(id);
        return order.processingOrder();
    }

    public int addOrder(Order order) {
        return orderRepository.save(order);
    }
}