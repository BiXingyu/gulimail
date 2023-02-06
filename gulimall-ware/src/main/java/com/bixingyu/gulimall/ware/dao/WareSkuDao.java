package com.bixingyu.gulimall.ware.dao;

import com.bixingyu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:24:12
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
