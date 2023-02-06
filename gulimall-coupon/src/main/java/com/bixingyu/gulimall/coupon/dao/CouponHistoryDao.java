package com.bixingyu.gulimall.coupon.dao;

import com.bixingyu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:02:08
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
