package com.bixingyu.gulimall.product.dao;

import com.bixingyu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:22:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
