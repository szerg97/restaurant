package com.restaurant.warehouse.repository;

import com.restaurant.warehouse.model.Food;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty("spring.datasource.enabled")
public interface FoodRepository extends JpaRepository<Food, Long> {
}
