package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/2/1.
 */
@Repository
public interface ShopDao {

    /**
     * 通过shopid查询店铺
     * @param shopId
     * @return Shop
     */
    Shop queryByShopId(long shopId);
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);
    /**
     * 更新店铺
     * @param shop
     * @return
     */
    int updateShop(Shop shop);
}
