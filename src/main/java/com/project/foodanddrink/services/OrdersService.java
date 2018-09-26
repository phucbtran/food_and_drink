package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    OrderRepository orderRepository;
}
