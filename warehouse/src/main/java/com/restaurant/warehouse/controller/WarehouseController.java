package com.restaurant.warehouse.controller;

import com.restaurant.warehouse.model.Food;
import com.restaurant.warehouse.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/warehouse")
public class WarehouseController {

    @Autowired(required = false)
    private FoodRepository repository;

    @Value("${spring.datasource.url}")
    private static String DATABASE_URL;

    @GetMapping("/meal")
    public String getMeal(){
        return "Cheese Burger XXL";
    }

    @GetMapping("/foods")
    public List<Food> getAll(){
        return repository.findAll();
    }

    @GetMapping("/datasource")
    public String getDataSourceUrl(){
        return DATABASE_URL;
    }
}
