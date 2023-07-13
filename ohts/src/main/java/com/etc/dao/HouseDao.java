package com.etc.dao;

import com.etc.pojo.House;
import com.etc.vo.HouseVO;

import java.util.List;

/**
 * @Author: wangjuyuan 李英
 * @Date: Created in 17:31 2021-04-06
 * @Description: 房源数据访问类  增加一个方法，根据业主ID查询业主名下的所有房产
 * @Version: 1.0 2.0
 */
public interface HouseDao {

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
     * 添加房源信息
     *
     * @param house 房源对象
     * @return 受影响的行数
     */
    public int insert(House house);

    /**
     * 删除房源(支持批量删除)
     *
     * @param hids 房源编号数组
     * @return 受影响的行数
     */
    public int delete(int[] hids);

    /**
     * 更新房源信息
     *
     * @param house 房源对象
     * @return 受影响的行数
     */
    public int update(House house);


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
     * 查找业主名下的所有房产
     * @param uid 业主ID
     * @return 房屋列表
     */
    public List<House> findByUid(int uid);

    /**
     * @param utid 房屋类型用途
     * @return 房屋vo列表
     */
    public List<HouseVO> findByUtid(int utid);

    /**
     * 查询所有审核通过的房屋vo
     */
    public List<HouseVO> findtgAll();

    /**
     *  查询所有审核未通过的房屋vo
     */
    public List<HouseVO> findwtgAll();

    /**
     * 查询所有的已通过审核的房源
     */
    public List<HouseVO> findtgByUtid(int utids);

}
