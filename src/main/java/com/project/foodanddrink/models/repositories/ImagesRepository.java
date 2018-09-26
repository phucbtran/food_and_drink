package com.project.foodanddrink.models.repositories;

import com.project.foodanddrink.models.entities.ImagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends JpaRepository<ImagesEntity, Integer> {
}
