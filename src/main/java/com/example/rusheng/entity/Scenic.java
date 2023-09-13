package com.example.rusheng.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @Author: Henrry
  * @Desctription: TODO
  * @Date: Created in 2023/9/13 21:07
  */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scenic implements Serializable {
    /**
    * 主键
    */
    private Integer scenicId;

    /**
    * 景点名称
    */
    private String scenicName;

    /**
    * 景点介绍
    */
    private String scenicDetail;

    /**
    * 封面
    */
    private String scenicCover;

    /**
    * 图片(数组)
    */
    private String scenicPicture;

    /**
    * 3D云游链接
    */
    private String scenicUnity;

    private static final long serialVersionUID = 1L;
}