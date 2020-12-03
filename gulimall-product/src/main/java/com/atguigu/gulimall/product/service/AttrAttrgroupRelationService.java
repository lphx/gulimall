package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.util.PageUtils;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lipenghong
 * @email 1580780206@qq.com
 * @date 2020-09-03 21:27:40
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveBatch(List<AttrRespVo> vos);
}

