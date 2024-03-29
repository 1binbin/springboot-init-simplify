package com.binbin.springbootinitsimplify.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.binbin.springbootinitsimplify.model.entity.InterfaceInfo;
import org.apache.ibatis.annotations.Mapper;

/**
* @author hongxiaobin
* @description 针对表【interface_info(接口信息)】的数据库操作Mapper
* @createDate 2023-07-01 17:07:53
* @Entity com.binbin.yuapibackend.model.entity.InterfaceInfo
*/
@Mapper
public interface InterfaceInfoMapper extends BaseMapper<InterfaceInfo> {

}




