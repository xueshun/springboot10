package com.xue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xue.bean.RoncooUser;
import com.xue.bean.RoncooUserExample;

@Mapper
public interface RoncooUserMapper {
    int countByExample(RoncooUserExample example);

    int deleteByExample(RoncooUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoncooUser record);

    int insertSelective(RoncooUser record);

    List<RoncooUser> selectByExample(RoncooUserExample example);

    RoncooUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoncooUser record, @Param("example") RoncooUserExample example);

    int updateByExample(@Param("record") RoncooUser record, @Param("example") RoncooUserExample example);

    int updateByPrimaryKeySelective(RoncooUser record);

    int updateByPrimaryKey(RoncooUser record);
}