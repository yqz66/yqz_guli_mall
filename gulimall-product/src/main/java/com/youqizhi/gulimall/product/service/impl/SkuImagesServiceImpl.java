package com.youqizhi.gulimall.product.service.impl;
import com.youqizhi.common.utils.Query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.product.dao.SkuImagesDao;
import com.youqizhi.gulimall.product.entity.SkuImagesEntity;
import com.youqizhi.gulimall.product.service.SkuImagesService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}