package com.yantodev.api.endpoint;

import com.yantodev.api.util.statval.IApplicationConstant;
import com.yantodev.api.dto.request.RequestDiscountDto;
import com.yantodev.api.dto.response.ResponseDiscountDto;
import com.yantodev.api.util.IResultDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(IApplicationConstant.ContextPath.DISCOUNT_V1)
public interface IDiscountEndpoint {
    @PostMapping(IApplicationConstant.path.discount.COUNT)
    IResultDTO<List<ResponseDiscountDto>> addData(@RequestBody RequestDiscountDto requestDiscountDTO);

}
