package com.company.onlineshop.mapper;

import com.company.onlineshop.dto.CategoryDto;
import com.company.onlineshop.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(source = "categoryName", target = "name")
    Category to(CategoryDto categoryDto);


}
