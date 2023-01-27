package com.restaurant.warehouse.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "foods")
public class Food {


    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "food_seq"
    )
    @SequenceGenerator(
            name = "food_seq",
            sequenceName = "food_seq"
    )
    private Long id;
    private String name;
    private LocalDateTime timestamp;

    public Food(String name, LocalDateTime timestamp) {
        this.name = name;
        this.timestamp = timestamp;
    }
}
