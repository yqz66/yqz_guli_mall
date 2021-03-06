package com.youqizhi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-16 13:07:50
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

