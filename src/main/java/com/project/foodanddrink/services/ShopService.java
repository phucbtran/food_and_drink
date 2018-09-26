package com.project.foodanddrink.services;

import com.project.foodanddrink.models.entities.ShopEntity;
import com.project.foodanddrink.models.repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShopService {
    @Autowired
    ShopRepository shopRepository;

    public void save() {
        ShopEntity shopEntity = new ShopEntity();
        shopEntity.setIdShop(2);
        shopEntity.setAddress("aa");
        shopEntity.setAverageShopCost(1.3);
        shopEntity.setEmail("abc@gmail.com");
        shopEntity.setLogo("asdasd");
        shopRepository.save(shopEntity);
    }
}
