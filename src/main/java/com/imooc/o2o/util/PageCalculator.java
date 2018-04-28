package com.imooc.o2o.util;

/**
 * Created by Administrator on 2018/4/28.
 */
public class PageCalculator {
    public static int calculateRowIndex(int pageIndex,int pageSize){
        return (pageIndex>0)?(pageIndex-1)*pageSize:0;
    }
}
