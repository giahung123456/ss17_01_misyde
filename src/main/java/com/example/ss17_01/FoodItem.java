package com.example.ss17_01;

import java.io.Serializable;

public class FoodItem implements Serializable {
    private Long id;
    private String name;
    private Double price;

    public FoodItem() {
    }

    public FoodItem(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}