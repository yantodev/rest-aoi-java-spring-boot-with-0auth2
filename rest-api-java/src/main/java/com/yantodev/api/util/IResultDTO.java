package com.yantodev.api.util;

import java.util.Map;

public interface IResultDTO<T> {

    T getResult();

    AResponseDTO getResponseData();

    Map<String, String> getMetaData();
}
