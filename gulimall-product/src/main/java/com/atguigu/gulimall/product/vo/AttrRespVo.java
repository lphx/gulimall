package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @Author: Penghong Li
 * @Date: Create in 16:07 2020/9/5
 */

@Data
public class AttrRespVo extends AttrVo {

    private String catelogName;
    private String groupName;

    private Long[] catelogPath;

}
