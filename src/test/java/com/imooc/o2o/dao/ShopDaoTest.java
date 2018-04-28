package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2018/2/1.
 */
public class ShopDaoTest extends BaseTest{
    @Autowired
    private  ShopDao shopDao;

    @Test
    @Ignore
    public  void testQueryByShopId(){
        long shopId=1;
        Shop shop=shopDao.queryByShopId(shopId);
        System.out.println("areaid"+shop.getArea().getAreaId());
        System.out.println("areaname"+shop.getArea().getAreaName());
    }
    @Test
    public void TestQueryShopListAndCount(){
        Shop shopCondition=new Shop();
        PersonInfo owner=new PersonInfo();
        owner.setUserId(1l);
        shopCondition.setOwner(owner);
        List<Shop> shopList=shopDao.queryShopList(shopCondition,0,5);
        int count=shopDao.queryShopCount(shopCondition);
        System.out.println("店铺总数："+count);
        System.out.println("店铺列表的大小"+shopList.size());

        ShopCategory sc=new ShopCategory();
        sc.setShopCategoryId(2l);

        shopCondition.setShopCategory(sc);
        List<Shop> shopList2=shopDao.queryShopList(shopCondition,0,2);
        int count2=shopDao.queryShopCount(shopCondition);
        System.out.println("shopcount:"+count2);
        System.out.println("店铺列表的大小："+shopList2.size());


    }


    @Test
    @Ignore
    public  void testInsertShop(){
        Shop shop=new Shop();
        PersonInfo owner=new PersonInfo();
        Area area=new Area();
        ShopCategory shopCategory=new ShopCategory();
        owner.setUserId(1l);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1l);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setPhone("test");
        shop.setCreateTime(new Date());
        shop.setShopName("正式店铺");
        shop.setAdvice("审核中");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setShopImg("test");
        shop.setEnableStatus(1);
        int effectedNum=shopDao.insertShop(shop);
        assertEquals(1,effectedNum);

    }
    @Test
    @Ignore
    public  void testUpdateShop(){
        Shop shop=new Shop();
        shop.setShopId(1l);
        shop.setShopDesc("更新测试");
        shop.setShopAddr("更新测试");
        int effectedNum=shopDao.updateShop(shop);
        assertEquals(1,effectedNum);

    }
}
