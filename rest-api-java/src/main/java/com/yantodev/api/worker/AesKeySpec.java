package com.yantodev.api.worker;

import lombok.Data;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@Data
public class AesKeySpec {

    private SecretKeySpec key;
    private IvParameterSpec iv;
}
