package com.project.foodanddrink.models.repositories;

import com.project.foodanddrink.models.entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
}
