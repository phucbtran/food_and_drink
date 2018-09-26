package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.SizesOfFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SizeOfFoodService {
    @Autowired
    SizesOfFoodRepository sizesOfFoodRepository;
}
