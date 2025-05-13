package com.jp.ecommerce.entities;

import java.math.BigDecimal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stock;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
