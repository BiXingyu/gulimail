package com.bixingyu.gulimall.coupon.dao;

import com.bixingyu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:02:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
