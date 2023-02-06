package com.bixingyu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bixingyu.common.utils.PageUtils;
import com.bixingyu.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:22:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

