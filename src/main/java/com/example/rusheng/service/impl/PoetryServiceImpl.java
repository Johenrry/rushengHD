package com.example.rusheng.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.rusheng.entity.Poetry;
import com.example.rusheng.mapper.PoetryMapper;
import com.example.rusheng.service.PoetryService;
/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Service
public class PoetryServiceImpl implements PoetryService{

    @Resource
    private PoetryMapper poetryMapper;

    @Override
    public int deleteByPrimaryKey(Integer poetryId) {
        return poetryMapper.deleteByPrimaryKey(poetryId);
    }

    @Override
    public int insert(Poetry record) {
        return poetryMapper.insert(record);
    }

    @Override
    public Poetry selectByPrimaryKey(Integer poetryId) {
        return poetryMapper.selectByPrimaryKey(poetryId);
    }

    @Override
    public int updateByPrimaryKey(Poetry record) {
        return poetryMapper.updateByPrimaryKey(record);
    }

}
