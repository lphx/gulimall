package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lipenghong
 * @email 1580780206@qq.com
 * @date 2020-08-17 21:31:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
