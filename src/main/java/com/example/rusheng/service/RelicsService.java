package com.example.rusheng.service;

import com.example.rusheng.entity.Relics;
    /**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

public interface RelicsService{


    int deleteByPrimaryKey(Integer relicsId);

    int insert(Relics record);

    Relics selectByPrimaryKey(Integer relicsId);

    int updateByPrimaryKey(Relics record);

}
