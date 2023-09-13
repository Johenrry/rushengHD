package com.example.rusheng.service;

import com.example.rusheng.entity.Role;
    /**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:06
  */

public interface RoleService{


    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKey(Role record);

}
