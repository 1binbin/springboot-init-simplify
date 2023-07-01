package com.binbin.springbootinitsimplify.exception;


import com.binbin.springbootinitsimplify.common.ErrorCode;

/**
 * 自定义异常
 * @Author hongxiaobin
 * @Time 2023/7/1 0001-17:30:26
 */
public class BusinessException extends  RuntimeException{
    private final Integer code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }

}
