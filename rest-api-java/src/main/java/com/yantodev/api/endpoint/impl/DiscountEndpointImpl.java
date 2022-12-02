package com.yantodev.api.endpoint.impl;

import com.yantodev.api.dto.request.RequestDiscountDto;
import com.yantodev.api.dto.response.ResponseDiscountDto;
import com.yantodev.api.endpoint.IDiscountEndpoint;
import com.yantodev.api.service.IDiscountService;
import com.yantodev.api.util.IResultDTO;
import com.yantodev.api.util.core.dto.APIResponseBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@Slf4j
public class DiscountEndpointImpl implements IDiscountEndpoint {
    private final IDiscountService discountService;
    @Override
    public IResultDTO<List<ResponseDiscountDto>> addData(RequestDiscountDto requestDiscountDTO) {

        List<ResponseDiscountDto> responseDiscountDTO;
        responseDiscountDTO =  discountService.countDiscount(requestDiscountDTO.getServiceFee(), requestDiscountDTO.getShippingCost(), requestDiscountDTO.getDiscountPrice(), requestDiscountDTO.getPay(), requestDiscountDTO.getProduct());
        return APIResponseBuilder.ok(responseDiscountDTO);
    }
}
