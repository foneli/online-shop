package com.company.onlineshop.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

public class CategoryDto {

    @ApiModelProperty(required = true)
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
