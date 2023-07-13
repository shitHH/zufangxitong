package com.etc.util;

import java.util.List;
import java.util.zip.DeflaterOutputStream;

/**
 * @author 李英
 * @date 2021-04-08
 * @category 工具类
 */
public class MyUtil {
    public static void show(List list){
        if(list.size()>0){
            for(Object o:list){
                System.out.println(o);
            }
        }else{
            System.out.println("集合为空");
        }
    }
}
