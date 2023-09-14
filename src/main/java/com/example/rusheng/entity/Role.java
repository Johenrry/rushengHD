package com.example.rusheng.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
    * 主键id
    */
    private Integer roleId;

    /**
    * 人物名称

    */
    private String roleName;

    /**
    * 人物朝代
    */
    private String roleDynasty;

    /**
    * 人物头像
    */
    private String roleAvatar;

    /**
    * 出生日期
    */
    private Date roleBirth;

    /**
    * 逝世日期
    */
    private Date roleDeath;

    /**
    * 人物身份
    */
    private String roleIdentity;

    /**
    * 人物介绍
    */
    private String roleDetail;

    /**
    * 生平简介
    */
    private String roleBiography;

    private static final long serialVersionUID = 1L;
}