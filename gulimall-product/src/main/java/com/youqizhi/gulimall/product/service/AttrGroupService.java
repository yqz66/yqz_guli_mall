package com.youqizhi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-16 13:07:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

