package com.youqizhi.gulimall;

import com.youqizhi.gulimall.product.GulimallProductApplication;
import com.youqizhi.gulimall.product.entity.BrandEntity;
import com.youqizhi.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
@SpringBootTest(classes = GulimallProductApplication.class)
public class Testds {


    @Autowired
    private BrandService brandService;

    @Test
    public void context() {
       /* BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("成功");*/

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
        System.out.println("成功");

    }
}
