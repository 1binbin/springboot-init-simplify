package com.binbin.springbootinitsimplify.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回响应格式
 *
 * @Author hongxiaobin
 * @Time 2023/7/1 0001-17:14:28
 */
@Data
public class BaseResponse<T> implements Serializable {
    private Integer code;
    private T data;
    private String message;

    public BaseResponse(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(Integer code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
