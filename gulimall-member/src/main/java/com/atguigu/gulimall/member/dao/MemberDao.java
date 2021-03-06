package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lipenghong
 * @email 1580780206@qq.com
 * @date 2020-08-17 22:00:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
