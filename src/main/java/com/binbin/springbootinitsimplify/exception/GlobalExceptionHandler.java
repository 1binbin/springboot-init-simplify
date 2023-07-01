package com.binbin.springbootinitsimplify.exception;


import com.binbin.springbootinitsimplify.common.BaseResponse;
import com.binbin.springbootinitsimplify.common.ErrorCode;
import com.binbin.springbootinitsimplify.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 *
 * @Author hongxiaobin
 * @Time 2023/7/1 0001-17:31:39
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 自定义异常
     * @param businessException 自定义异常
     * @return 响应数据
     */
    @ExceptionHandler
    public BaseResponse<?> businessExceptionHandler(BusinessException businessException) {
        log.error("businessException: " + businessException.getMessage(), businessException);
        return ResultUtils.error(businessException.getCode(), businessException.getMessage());
    }

    /**
     * 运行时异常
     * @param runtimeException 运行时异常
     * @return 响应数据
     */
    @ExceptionHandler
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException runtimeException) {
        log.error("runtimeException", runtimeException);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, runtimeException.getMessage());
    }
}
