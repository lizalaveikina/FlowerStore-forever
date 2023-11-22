package ua.edu.ucu.apps.demo.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAll() {
        return orderService.getAll();
    }
    @GetMapping("/info")
    public String getInfo(@RequestParam int id) {
        return orderService.info(id);
    }
    @PostMapping("/add")
    public int addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
