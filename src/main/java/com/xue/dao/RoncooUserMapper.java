package com.xue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xue.bean.RoncooUser;

@Mapper
public interface RoncooUserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(RoncooUser record);

    int insertSelective(RoncooUser record);

    RoncooUser selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(RoncooUser record);

    int updateByPrimaryKey(RoncooUser record);
}