package com.yantodev.api.service.impl;

import com.yantodev.api.dto.request.ProductDto;
import com.yantodev.api.dto.response.ResponseDiscountDto;
import com.yantodev.api.service.IDiscountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
@Service
public class DiscountServiceImpl implements IDiscountService {
    @Override
    public List<ResponseDiscountDto> countDiscount(Float serviceFee, Float shippingCost, Float discountPrice, Float pay, List<ProductDto> productDto) {

        List<ResponseDiscountDto> list = new ArrayList<>();
        for (ProductDto product : productDto) {
            Float price = countTotalDiscount(shippingCost, serviceFee, discountPrice, productDto.size());
            list.add(
                    ResponseDiscountDto
                            .builder()
                            .name(product.getName())
                            .priceAfterDiscount(product.getPrice() - price)
                            .qty(product.getQty())
                            .build()
            );
        }
        return list;
    }

    private Float countTotalDiscount(Float shippingCost, Float serviceFee, Float discountPrice, int size) {
        return (discountPrice - shippingCost - serviceFee) / size;
    }
}
