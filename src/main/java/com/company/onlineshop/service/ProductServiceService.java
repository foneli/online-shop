package com.company.onlineshop.service;

import com.company.onlineshop.model.Product;
import com.company.onlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceService implements IProductService {
    @Autowired
    ProductRepository productRepository;


    @Override
    public void add(Long id, Product product) {

    }
}
