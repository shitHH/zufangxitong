package com.etc.service;

import com.etc.pojo.House;
import com.etc.vo.HouseVO;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 房源信息业务逻辑层
 * @date 2021/4/7  14:40
 */
public interface HouseService {

    /**
     * 查询所有房源信息
     *
     * @return 房源集合
     */
    public List<House> findAllHouse();

    /**
     * 通过房源编号查询房子
     * @param hid
     * @return
     */
    public House findByHid(int hid);
    /**
     * 更新房源信息
     *
     * @param house 房源对象
     * @return 受影响的行数
     */
    public boolean update(House house);

    /**
     * 添加房源信息
     *
     * @param house 房源对象
     * @return 受影响的行数
     */
    public boolean addhouse(House house);

    /**
     * 查询所有房源的信息
     * @return
     */
    public List<HouseVO> findAll();
    /**
     * 通过房源编号查询具体房源信息
     * @param hid
     * @return
     */
    public HouseVO findByHid3(int hid);
    /**
     * 通过用途编号查询具体房源信息
     * @param
     * @return
     */
    public List<HouseVO> findByUtid(int utid);


    /**
     * 查询所有审核通过的房源信息
     * @return
     */
    public List<HouseVO> findtgAll();
    /**
     * 查询所有审核未通过的房屋vo
     */
    public List<HouseVO> findwtgAll();
    /**
     * 通过用途编号查询具体通过的房源信息
     * @param
     * @return
     */
    public List<HouseVO> findtgByUtid(int utid);
    /**
     * 查找业主名下的所有房产
     * @param uid 业主ID
     * @return 房屋列表
     */
    public List<House> findByUid(int uid);
}
