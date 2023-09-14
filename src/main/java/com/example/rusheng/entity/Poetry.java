package com.example.rusheng.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Poetry implements Serializable {
    /**
    * 主键id
    */
    private Integer poetryId;

    /**
    * 古诗标题
    */
    private String poetryTitle;

    /**
    * 故事内容
    */
    private String poetryContent;

    /**
    * 赏析
    */
    private String poetryAnalyse;

    /**
    * 封面
    */
    private String poetryCover;

    /**
    * 背景图（诗情画意）
    */
    private String poetryBackground;

    /**
    * 所属诗人id
    */
    private Integer roleId;

    private static final long serialVersionUID = 1L;
}