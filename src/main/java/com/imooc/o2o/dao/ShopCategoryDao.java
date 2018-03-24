package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/2/16.
 */
@Repository
public interface ShopCategoryDao {

    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);
}
