package com.youqizhi.gulimall.coupon.controller;

import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.common.utils.R;
import com.youqizhi.gulimall.coupon.entity.CouponEntity;
import com.youqizhi.gulimall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;


/**
 * 优惠券信息
 *
 * @author youqizhi
 * @email 894528698@qq.com
 * @date 2020-05-17 13:37:34
 */
@RestController
@RequestMapping("coupon/coupon")
@RefreshScope
public class CouponController {
    @Autowired
    private CouponService couponService;


    @Value("${youqizhi.name}")
    private String name;
    @Value("${youqizhi.age}")
    private String age;

    /**
     * 测试配置中心
     *
     * @param
     * @return
     */
    @RequestMapping("config/test")
    public R configTest() {
        return R.ok().put("name", name).put("age", age);
    }


    /**
     * 测试 feign 远程调用
     *
     * @return
     */
    @RequestMapping("/member/coupon")
    public R memberCoupon() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满一百送两百");
        return R.ok().put("coupon", Arrays.asList(couponEntity));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id) {
        CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon) {
        couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon) {
        couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids) {
        couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
