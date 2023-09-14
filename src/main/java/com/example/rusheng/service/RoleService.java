package com.example.rusheng.service;

import com.example.rusheng.entity.Role;

import java.util.List;


public interface RoleService{


    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKey(Role record);

    List<Role> selectAllBy(Role role);
    }
