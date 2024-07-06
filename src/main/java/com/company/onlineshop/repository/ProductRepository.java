package com.company.onlineshop.repository;

import com.company.onlineshop.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;

public interface ProductRepository extends CrudRepository<Product, Long> {


}
