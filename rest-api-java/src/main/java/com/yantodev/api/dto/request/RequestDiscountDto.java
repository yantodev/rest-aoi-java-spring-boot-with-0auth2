package com.yantodev.api.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class RequestDiscountDto {
    Float serviceFee;
    Float shippingCost;
    Float discountPrice;
    Float pay;
    List<ProductDto> product;
}
