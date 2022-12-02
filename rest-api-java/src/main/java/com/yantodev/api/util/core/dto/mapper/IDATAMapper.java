package com.yantodev.api.util.core.dto.mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface IDATAMapper<SOURCE, TARGET> extends Converter<SOURCE, TARGET> {
    List<TARGET> mapEntitiesIntoDTOs(Iterable<SOURCE> entities);

    Page<TARGET> mapEntityPageIntoDTOPage(Pageable pageRequest, Page<SOURCE> source);

    Slice<TARGET> mapEntitySliceIntoDTOSlice(Slice<SOURCE> source);

    SOURCE convertReverse(TARGET p_TARGET);

    ConvertResponseEntityDto convertWithResponseEntity(SOURCE source);

    Page<TARGET> mapEntityPageIntoDTOPage(Page<SOURCE> data);

    List<SOURCE> mapEntitiesIntoDTOsReverse(List<TARGET> targets);
}
