package com.etc.dao;

import com.etc.pojo.HouseType;

import java.util.List;

/**
 * @Author: wangjuyuan
 * @Date: Created in 20:22 2021-04-06
 * @Description: 户型数据访问接口
 * @Version: 1.0
 */
public interface HouseTypeDao {

    /**
     * 查询所有户型
     *
     * @return 所有户型集合
     */
    public List<HouseType> findAllHouseType();

    /**
     * 添加户型信息
     *
     * @param houseType 户型对象
     * @return 受影响的行数
     */
    public int insert(HouseType houseType);

    /**
     * 删除户型信息(支持批量删除)
     *
     * @param tids 户型编号数组
     * @return 受影响的行数
     */
    public int delete(int[] tids);

    /**
     * 更新户型信息
     *
     * @param houseType 户型对象
     * @return 受影响的行数
     */
    public int update(HouseType houseType);
}
