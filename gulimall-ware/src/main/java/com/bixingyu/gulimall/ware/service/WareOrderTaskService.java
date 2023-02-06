package com.bixingyu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bixingyu.common.utils.PageUtils;
import com.bixingyu.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:24:12
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

