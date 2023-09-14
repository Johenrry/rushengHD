package com.example.rusheng.controller;


import com.example.rusheng.entity.Role;
import com.example.rusheng.result.Result;
import com.example.rusheng.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "人物相关接口")
@RequestMapping("rusheng/role")
@Slf4j
public class roleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    @ApiOperation("根据字段查询")
    public Result<List<Role>> selectAllBy(@RequestBody(required = false) Role role){
//        log.info("人物根据字段查询:{}",role);
        if (role == null){
            role = new Role();
        }
        return Result.success(roleService.selectAllBy(role));
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result<Role> selectById(@PathVariable int id){
        return Result.success(roleService.selectByPrimaryKey(id));
    }
}
