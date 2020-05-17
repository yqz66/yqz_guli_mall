package com.youqizhi.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-17 14:11:44
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

