package com.example.rusheng.mapper;

import com.example.rusheng.entity.Poetry;
import org.apache.ibatis.annotations.Mapper;

/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Mapper
public interface PoetryMapper {
    int deleteByPrimaryKey(Integer poetryId);

    int insert(Poetry record);

    Poetry selectByPrimaryKey(Integer poetryId);

    int updateByPrimaryKey(Poetry record);
}