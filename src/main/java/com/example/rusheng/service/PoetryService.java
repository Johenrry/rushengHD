package com.example.rusheng.service;

import com.example.rusheng.entity.Poetry;
    /**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

public interface PoetryService{


    int deleteByPrimaryKey(Integer poetryId);

    int insert(Poetry record);

    Poetry selectByPrimaryKey(Integer poetryId);

    int updateByPrimaryKey(Poetry record);

}
