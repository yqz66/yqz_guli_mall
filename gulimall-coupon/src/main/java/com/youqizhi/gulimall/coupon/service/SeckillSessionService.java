package com.youqizhi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-17 13:37:34
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

