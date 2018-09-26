package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {
    @Autowired
    ReviewsRepository reviewsRepository;
}
