package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2018/2/4.
 */
public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Autowired
    private ShopDao shopDao;

    @Test
    @Ignore
    public  void  testModifyShop() throws ShopOperationException,FileNotFoundException{
       Shop shop=new Shop();
       shop.setShopId(1l);
       shop.setShopName("修改收的店铺名称");
        File shopImg=new File("G:\\image\\image\\dabai.jpg");
        InputStream is=new FileInputStream(shopImg);
        ShopExecution shopExecution= shopService.modifyShop(shop,is,"dabai.jpg");
        System.out.println("新的图片地址："+shopExecution.getShop().getShopImg());
    }
    @Test
    public void testGetShopList(){
        Shop shopCondition=new Shop();
        ShopCategory sc=new ShopCategory();
        sc.setShopCategoryId(2l);
        shopCondition.setShopCategory(sc);
        ShopExecution se=shopService.getShopList(shopCondition,2,2);
        System.out.println("店铺列表数"+se.getShopList().size());
        System.out.println("店铺总数："+se.getCount());
    }


    @Test
    @Ignore
    public  void testAddShop() throws FileNotFoundException {
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
        shop.setPhone("test3");
        shop.setCreateTime(new Date());
        shop.setShopName("测试的店铺4");
        shop.setAdvice("审核中");
        shop.setShopDesc("test3");
        shop.setShopAddr("test3");
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());

        File shopImg=new File("G:\\image\\image\\dabai.jpg");
        InputStream is=new FileInputStream(shopImg);
        ShopExecution se= shopService.addShop(shop,is,shopImg.getName());
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }
}
