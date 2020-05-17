package com.youqizhi.gulimall.product.dao;

import com.youqizhi.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-16 13:07:51
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
