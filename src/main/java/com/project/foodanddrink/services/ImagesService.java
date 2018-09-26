package com.project.foodanddrink.services;

import com.project.foodanddrink.models.repositories.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesService {
    @Autowired
    ImagesRepository imagesRepository;
}
