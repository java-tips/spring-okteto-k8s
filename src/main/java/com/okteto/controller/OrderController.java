package com.okteto.controller;

import com.okteto.model.Order;
import com.okteto.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/order")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @PostMapping
    public Order add(@RequestBody Order order) {
        return repository.save(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order) {
        return repository.save(order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        repository.deleteById(id);
    }

    @GetMapping
    public Iterable<Order> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable("id") String id) {
        return repository.findById(id);
    }

}
