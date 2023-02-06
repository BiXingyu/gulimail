package com.bixingyu.gulimall.order.dao;

import com.bixingyu.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-05 17:33:33
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
