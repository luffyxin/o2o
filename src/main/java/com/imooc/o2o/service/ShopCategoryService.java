package com.imooc.o2o.service;

import com.imooc.o2o.entity.ShopCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/2/17.
 */
public interface ShopCategoryService {
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
