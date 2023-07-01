package com.binbin.springbootinitsimplify.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 * @Author: hongxiaobin
 * @Time: 2023/7/1 0001 17:21:00
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

