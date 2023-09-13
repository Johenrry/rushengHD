package com.example.rusheng.service;

import com.example.rusheng.entity.Scenic;
    /**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

public interface ScenicService{


    int deleteByPrimaryKey(Integer scenicId);

    int insert(Scenic record);

    Scenic selectByPrimaryKey(Integer scenicId);

    int updateByPrimaryKey(Scenic record);

}
