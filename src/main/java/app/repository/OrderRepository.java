package app.repository;

import app.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public Order getById(int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Order> getAll() {
        return orders;
    }

    public void add(Order order) {
        if(order != null) orders.add(order);
    }
}
