package com.binbin.springbootinitsimplify.common;

/**
 * 返回工具类
 * @Author hongxiaobin
 * @Time 2023/7/1 0001-17:22:59
 */

public class ResultUtils {
    /**
     * 成功
     * @param data 成功数据
     * @param <T> 数据类型
     * @return 响应数据
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }

    /**
     * 失败
     * @param errorCode 错误码
     * @param <T> 数据格式
     * @return 响应数据
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code 错误码
     * @param message 错误信息
     * @param <T> 数据格式
     * @return 响应数据
     */
    public static <T> BaseResponse<T> error(Integer code, String message){
        return new BaseResponse<>(code,null,message);
    }

    /**
     * 失败
     * @param errorCode 错误常量码
     * @param message 错误信息
     * @param <T>  数据格式
     * @return 相应数据
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message){
        return new BaseResponse<>(errorCode.getCode(),null,message);
    }
}
