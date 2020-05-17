package com.youqizhi.gulimall.order.dao;

import com.youqizhi.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-17 14:06:56
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
