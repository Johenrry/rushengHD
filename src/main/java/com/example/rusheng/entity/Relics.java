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
public class Relics implements Serializable {
    /**
    * 主键
    */
    private Integer relicsId;

    /**
    * 文物名称
    */
    private String relicsName;

    /**
    * 文物介绍
    */
    private String relicsDetail;

    /**
    * 封面
    */
    private String relicsCover;

    /**
    * 图片（数组）
    */
    private String scenicPicture;

    /**
    * 3D云游链接
    */
    private String relicsUnity;

    private static final long serialVersionUID = 1L;
}