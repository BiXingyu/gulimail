package com.bixingyu.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-plus
 *  ①导入依赖
 *  ②配置
 *      1、配置数据源
 *          1）导入数据库驱动
 *          2) 配置数据源
 *      2、配置Mybatis-Plus：
 *          1）使用MapperScan配置mapper扫描包位置
 *          2）告诉mybatisplus，sql映射文件位置
 *
 */
@MapperScan("com.bixingyu.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallOrderApplication.class, args);
    }

}
