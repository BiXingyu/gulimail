package com.bixingyu.gulimall.product.dao;

import com.bixingyu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:22:46
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
