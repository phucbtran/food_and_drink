package com.project.foodanddrink.controllers;
import com.project.foodanddrink.models.entities.ShopEntity;
import com.project.foodanddrink.models.repositories.ShopRepository;
import com.project.foodanddrink.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    ShopService shopService;

    @GetMapping("/abc")
    public String viewHome(Model model) {
        shopService.save();
        return "/admin/pages/index";
    }
}
