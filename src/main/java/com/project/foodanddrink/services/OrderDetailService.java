package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    OrderDetailRepository orderDetailRepository;
}
