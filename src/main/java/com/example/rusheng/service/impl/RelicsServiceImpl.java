package com.example.rusheng.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.rusheng.mapper.RelicsMapper;
import com.example.rusheng.entity.Relics;
import com.example.rusheng.service.RelicsService;
/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Service
public class RelicsServiceImpl implements RelicsService{

    @Resource
    private RelicsMapper relicsMapper;

    @Override
    public int deleteByPrimaryKey(Integer relicsId) {
        return relicsMapper.deleteByPrimaryKey(relicsId);
    }

    @Override
    public int insert(Relics record) {
        return relicsMapper.insert(record);
    }

    @Override
    public Relics selectByPrimaryKey(Integer relicsId) {
        return relicsMapper.selectByPrimaryKey(relicsId);
    }

    @Override
    public int updateByPrimaryKey(Relics record) {
        return relicsMapper.updateByPrimaryKey(record);
    }

}
