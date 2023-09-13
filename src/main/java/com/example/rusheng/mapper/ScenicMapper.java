package com.example.rusheng.mapper;

import com.example.rusheng.entity.Scenic;
import org.apache.ibatis.annotations.Mapper;

/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Mapper
public interface ScenicMapper {
    int deleteByPrimaryKey(Integer scenicId);

    int insert(Scenic record);

    Scenic selectByPrimaryKey(Integer scenicId);

    int updateByPrimaryKey(Scenic record);
}