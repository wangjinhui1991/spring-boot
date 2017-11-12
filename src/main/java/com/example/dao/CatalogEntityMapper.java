package com.example.dao;

import com.example.entity.CatalogEntity;


public interface CatalogEntityMapper {
    int deleteByPrimaryKey(Integer cataLogId);

    int insert(CatalogEntity record);

    int insertSelective(CatalogEntity record);

    CatalogEntity selectByPrimaryKey(Integer cataLogId);

    int updateByPrimaryKeySelective(CatalogEntity record);

    int updateByPrimaryKey(CatalogEntity record);
}