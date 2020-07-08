package com.youqizhi.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youqizhi.common.utils.PageUtils;
import com.youqizhi.common.utils.Query;
import com.youqizhi.gulimall.product.dao.CategoryDao;
import com.youqizhi.gulimall.product.entity.CategoryEntity;
import com.youqizhi.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、 查出所有分类
        List<CategoryEntity> entities = this.baseMapper.selectList(null);

        // 2、 组装成树形结构

        // 2.1 找到所有一级分类
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(entitie -> {
            // 查找当前分类下的子分类
            entitie.setChildren(this.getChildrens(entitie, entities));
            return entitie;
        }).sorted((menu1, menu2) ->
                (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort())
        ).collect(Collectors.toList());


        return level1Menus;
    }

    /**
     * 递归查找当前菜单的子菜单
     *
     * @param root
     * @param all
     * @return
     */
    public List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> entityList = all.stream().filter(entity ->
                entity.getParentCid() == root.getCatId()
        ).map(entity -> {
            // 1、 查找子菜单
            entity.setChildren(this.getChildrens(entity, all));
            return entity;
        }).sorted((menu1, menu2) ->
                (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort())
        ).collect(Collectors.toList());
        return entityList;
    }
}