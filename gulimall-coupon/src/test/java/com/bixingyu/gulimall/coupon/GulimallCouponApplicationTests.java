package com.bixingyu.gulimall.coupon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bixingyu.gulimall.coupon.entity.CouponEntity;
import com.bixingyu.gulimall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class GulimallCouponApplicationTests {
    @Autowired
    private CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
//        couponEntity.setCouponName("Xiaomi");
//        couponService.save(couponEntity);
//        log.info("插入成功{}" , couponEntity);
        couponEntity.setId(1L);

        List<CouponEntity> list = couponService.list(new QueryWrapper<CouponEntity>(couponEntity));
        list.forEach( ( item )  -> {
            System.out.println(item);
        });
//        couponService.removeById(1L);

    }

}
