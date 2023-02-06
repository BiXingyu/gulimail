package com.bixingyu.gulimall.order;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bixingyu.gulimall.order.entity.OrderEntity;
import com.bixingyu.gulimall.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest
class GulimallOrderApplicationTests {

    @Resource
    private OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillHeader("小米");
        OrderEntity orderEntity1 = new OrderEntity();
        orderEntity1.setId(1L);
//        orderService.save(orderEntity);
//        log.info("{} 保存成功" , orderEntity);

        List<OrderEntity> billHeader = orderService.list(new QueryWrapper<OrderEntity>(orderEntity1));
        billHeader.forEach((item) -> {
            System.out.println(item);
        });
    }

}
