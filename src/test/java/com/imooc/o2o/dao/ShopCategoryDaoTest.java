package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2018/2/16.
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public  void testQueryShopCategory(){
        List<ShopCategory> shopCategoryList=shopCategoryDao.queryShopCategory(new ShopCategory());
        assertEquals(2,shopCategoryList.size());
        ShopCategory testShopCategory=new ShopCategory();
        ShopCategory parentShopCategory=new ShopCategory();
        parentShopCategory.setShopCategoryId(1l);
        testShopCategory.setParent(parentShopCategory);
        shopCategoryList=shopCategoryDao.queryShopCategory(testShopCategory);
        assertEquals(1,shopCategoryList.size());
        System.out.println(shopCategoryList.get(0).getShopCategoryName());
    }
}
