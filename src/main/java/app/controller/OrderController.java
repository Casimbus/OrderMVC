package app.controller;

import app.model.Order;
import app.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderRepository.getById(id);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAll();
    }

    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderRepository.add(order);
    }
}
