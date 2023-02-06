package com.bixingyu.gulimall.order.dao;

import com.bixingyu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-05 17:33:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
