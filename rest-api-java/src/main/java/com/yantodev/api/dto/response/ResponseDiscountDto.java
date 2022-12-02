package com.yantodev.api.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDiscountDto {
    String name;
    Float priceAfterDiscount;
    Integer qty;
}
