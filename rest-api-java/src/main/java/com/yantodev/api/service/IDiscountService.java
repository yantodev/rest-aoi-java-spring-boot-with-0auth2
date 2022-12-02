package com.yantodev.api.service;

import com.yantodev.api.dto.request.ProductDto;
import com.yantodev.api.dto.response.ResponseDiscountDto;

import java.util.List;

public interface IDiscountService {
    List<ResponseDiscountDto> countDiscount(Float discountPrice, Float serviceFee, Float fee, Float pay, List<ProductDto> productDto);
}
