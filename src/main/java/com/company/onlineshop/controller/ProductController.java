package com.company.onlineshop.controller;

import com.company.onlineshop.dto.ProductDto;
import com.company.onlineshop.mapper.ProductMapper;
import com.company.onlineshop.service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductMapper mapper;

    @Autowired
    IProductService productService;

    @PostMapping(value = "/add/{categoryId}")
    public ResponseEntity<Void> addProduct(@PathVariable(value = "categoryId") Long categoryId,
                                           @Valid @RequestBody ProductDto productDto) {

        productService.add(categoryId, mapper.to(productDto));
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();
    }
}
