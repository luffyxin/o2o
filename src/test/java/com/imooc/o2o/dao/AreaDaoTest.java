package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/30.
 */
public class AreaDaoTest extends BaseTest{
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }

}