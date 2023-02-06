package com.bixingyu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bixingyu.common.utils.PageUtils;
import com.bixingyu.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author bixingyu
 * @email bixingyu@gmail.com
 * @date 2023-02-06 11:20:17
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

