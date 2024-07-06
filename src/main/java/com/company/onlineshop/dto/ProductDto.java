package com.company.onlineshop.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


public class ProductDto {

    @ApiModelProperty(required = true)
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
