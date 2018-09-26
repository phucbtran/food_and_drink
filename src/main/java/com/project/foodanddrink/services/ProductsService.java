package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    ProductsRepository productsRepository;
}
