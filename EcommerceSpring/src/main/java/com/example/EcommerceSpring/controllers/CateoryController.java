package com.example.EcommerceSpring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CateoryController {
    @GetMapping
    public String getCategory(){
        return "Electonics";
    }
    @GetMapping("/count")
    public int getCategoryCount(){
        return 5;
    }
    @PostMapping
    public String postCategory(){
        return " Post Electonics";
    }
    @DeleteMapping
    public String deleteCategory(){
        return "Category deleted";
    }

}
