package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
    @Autowired
    CategoriesRepository categoriesRepository;
}
