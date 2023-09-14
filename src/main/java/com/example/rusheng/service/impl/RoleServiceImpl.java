package com.example.rusheng.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.rusheng.entity.Role;
import com.example.rusheng.mapper.RoleMapper;
import com.example.rusheng.service.RoleService;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public Role selectByPrimaryKey(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> selectAllBy(Role role) {
        return roleMapper.selectByAll(role);
    }

}
