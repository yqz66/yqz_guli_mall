package com.youqizhi.gulimall.coupon.dao;

import com.youqizhi.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-17 13:37:34
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
