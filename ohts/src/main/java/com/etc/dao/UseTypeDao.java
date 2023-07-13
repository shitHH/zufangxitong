package com.etc.dao;

import com.etc.pojo.UseType;

import java.util.List;

/**
 * @author yyf
 * 房屋类型接口
 */
public interface UseTypeDao {
    /**
     * 查询房屋类型的集合
     *
     * @return
     */
    public List<UseType> findAll();

    /**
     * 根据房屋的类型编号查找房屋类型对象
     *
     * @param utid
     * @return
     */
    public UseType findByUtid(int utid);







}
