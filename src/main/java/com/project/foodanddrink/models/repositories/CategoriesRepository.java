package com.project.foodanddrink.models.repositories;

import com.project.foodanddrink.models.entities.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Integer> {
}
