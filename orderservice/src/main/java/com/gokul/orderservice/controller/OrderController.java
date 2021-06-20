package com.gokul.orderservice.controller;

import com.gokul.orderservice.entity.Order;
import com.gokul.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    public Order bookOrder(@RequestBody Order order){
        return service.saveOrder(order);
    }
}
