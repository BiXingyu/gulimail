package com.bixingyu.gulimall.member.dao;

import com.bixingyu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:20:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
