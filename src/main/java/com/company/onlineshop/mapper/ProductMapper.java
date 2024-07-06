package com.company.onlineshop.mapper;

import com.company.onlineshop.dto.ProductDto;
import com.company.onlineshop.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "productName", target = "name")
    Product to(ProductDto productDto);


}
