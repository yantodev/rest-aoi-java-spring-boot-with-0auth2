package com.yantodev.api.dto.request;

import lombok.Data;

@Data
public class ProductDto {
    String name;
    Float price;
    Integer qty;
}
