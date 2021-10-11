package com.spacetim.middleware.model.mapper;


import com.spacetim.middleware.model.entity.RedRecord;

public interface RedRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RedRecord record);

    int insertSelective(RedRecord record);

    RedRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RedRecord record);

    int updateByPrimaryKey(RedRecord record);
}