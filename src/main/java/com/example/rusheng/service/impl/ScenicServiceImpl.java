package com.example.rusheng.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.rusheng.entity.Scenic;
import com.example.rusheng.mapper.ScenicMapper;
import com.example.rusheng.service.ScenicService;
/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Service
public class ScenicServiceImpl implements ScenicService{

    @Resource
    private ScenicMapper scenicMapper;

    @Override
    public int deleteByPrimaryKey(Integer scenicId) {
        return scenicMapper.deleteByPrimaryKey(scenicId);
    }

    @Override
    public int insert(Scenic record) {
        return scenicMapper.insert(record);
    }

    @Override
    public Scenic selectByPrimaryKey(Integer scenicId) {
        return scenicMapper.selectByPrimaryKey(scenicId);
    }

    @Override
    public int updateByPrimaryKey(Scenic record) {
        return scenicMapper.updateByPrimaryKey(record);
    }

}
