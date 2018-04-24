package com.zjbdos.module.test.dao;

import com.zjbdos.module.test.entity.Basic;

public interface BasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Basic record);

    int insertSelective(Basic record);

    Basic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Basic record);

    int updateByPrimaryKey(Basic record);
}