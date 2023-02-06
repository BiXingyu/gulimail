package com.bixingyu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bixingyu.common.utils.PageUtils;
import com.bixingyu.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:02:08
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

