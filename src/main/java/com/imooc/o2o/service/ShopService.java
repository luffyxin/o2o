package com.imooc.o2o.service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/2/2.
 */
public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImgInputStream,String fileName);
}
