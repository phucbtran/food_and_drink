package com.project.foodanddrink.models.repositories;

import com.project.foodanddrink.models.entities.SizesOfFoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizesOfFoodRepository extends JpaRepository<SizesOfFoodEntity, Integer> {
}
