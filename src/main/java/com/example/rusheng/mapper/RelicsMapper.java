package com.example.rusheng.mapper;

import com.example.rusheng.entity.Relics;
import org.apache.ibatis.annotations.Mapper;

/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Mapper
public interface RelicsMapper {
    int deleteByPrimaryKey(Integer relicsId);

    int insert(Relics record);

    Relics selectByPrimaryKey(Integer relicsId);

    int updateByPrimaryKey(Relics record);
}