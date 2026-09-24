package com.example.ss17_01;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RestaurantService {

    @Cacheable(value = "foods", key = "#restaurantId")
    public List<FoodItem> getFoodsByRestaurant(Long restaurantId) {
        System.out.println("--> Truy van du lieu thuc te tu Database cho quan: " + restaurantId);
        return Arrays.asList(
                new FoodItem(1L, "Pho Bo Tai", 45000.0),
                new FoodItem(2L, "Com Tam Suon Bi", 50000.0)
        );
    }
}