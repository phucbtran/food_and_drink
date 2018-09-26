package com.project.foodanddrink.models.repositories;

import com.project.foodanddrink.models.entities.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<ReviewsEntity, Integer> {
}
