package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Repository
public interface AreaDao {
    /*
    列出区域列表
    @return areaList
     */
    List<Area> queryArea();
}
