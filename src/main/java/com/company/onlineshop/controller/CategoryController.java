package com.company.onlineshop.controller;

import com.company.onlineshop.dto.CategoryDto;
import com.company.onlineshop.mapper.CategoryMapper;
import com.company.onlineshop.model.Category;
import com.company.onlineshop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.net.ssl.HttpsURLConnection;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryMapper mapper;
    @Autowired
    ICategoryService categoryService;

    @PostMapping("/add")
    public ResponseEntity<Void> addCategory(@RequestBody CategoryDto categoryDto) {

        Category category = mapper.to(categoryDto);
        categoryService.add(category);
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();
    }
}
