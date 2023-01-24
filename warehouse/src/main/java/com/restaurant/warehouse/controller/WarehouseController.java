package com.restaurant.warehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/warehouse")
public class WarehouseController {

    @GetMapping("/meal")
    public String getMeal(){
        return "Cheese Burger XXL";
    }
}
