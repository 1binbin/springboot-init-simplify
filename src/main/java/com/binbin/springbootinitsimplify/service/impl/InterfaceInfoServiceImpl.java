package com.binbin.springbootinitsimplify.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.binbin.springbootinitsimplify.mapper.InterfaceInfoMapper;
import com.binbin.springbootinitsimplify.model.entity.InterfaceInfo;
import com.binbin.springbootinitsimplify.service.InterfaceInfoService;

import org.springframework.stereotype.Service;

/**
 * @author hongxiaobin
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2023-07-01 17:07:53
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

}




