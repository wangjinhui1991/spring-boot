package com.example.dao;

import com.example.entity.OfferEntity;


public interface OfferEntityMapper {
    int deleteByPrimaryKey(Integer offerId);

    int insert(OfferEntity record);

    int insertSelective(OfferEntity record);

    OfferEntity selectByPrimaryKey(Integer offerId);

    int updateByPrimaryKeySelective(OfferEntity record);

    int updateByPrimaryKey(OfferEntity record);
}