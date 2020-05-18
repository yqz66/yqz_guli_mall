package com.youqizhi.gulimall.member.feign;

import com.youqizhi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 89452 on 2020/5/18.
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 测试 feign 远程调用
     *
     * @return
     */
    @RequestMapping("/coupon/coupon/member/coupon")
    public R memberCoupon();
}
