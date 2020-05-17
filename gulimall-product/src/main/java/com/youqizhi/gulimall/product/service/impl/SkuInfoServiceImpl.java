package com.youqizhi.gulimall.product.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.product.dao.SkuInfoDao;
import com.youqizhi.gulimall.product.entity.SkuInfoEntity;
import com.youqizhi.gulimall.product.service.SkuInfoService;
import org.springframework.stereotype.Service;
import com.youqizhi.common.utils.Query;

import java.util.Map;

@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<SkuInfoEntity>()
        );

        return new PageUtils(page);
    }

}