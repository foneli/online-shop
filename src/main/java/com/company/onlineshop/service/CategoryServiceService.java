package com.company.onlineshop.service;

import com.company.onlineshop.model.Category;
import com.company.onlineshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public void add(Category category) {

    }
}
