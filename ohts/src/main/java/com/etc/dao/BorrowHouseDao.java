package com.etc.dao;

import com.etc.pojo.BorrowHouse;
import com.etc.vo.BorrowHouseVO;


import java.util.List;

/**
 * Project：ohts
 * classname:BorrowHouseDao
 * Date：2021/4/6
 * Time：17:33
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 房屋租赁业务逻辑接口
 */
public interface BorrowHouseDao {
    /**
     * 查找所有租赁房源的集合
     * @return
     */
    public List<BorrowHouseVO> findAll();

    /**
     * 通过租赁房源Id查询租赁房源所有信息
     * @param brid 租赁房源Id
     * @return
     */
    public BorrowHouseVO findByBrid(int brid);
    /**
     * 通过租赁房源Id查询租赁房源信息
     * @param brid 租赁房源Id
     * @return
     */
    public BorrowHouse findByid(int brid);

    /**
     * 通过房源信息查询借用表信息
     * @param hid
     * @return
     */
    public BorrowHouseVO findByHid(int hid);
    /**
     * 增加租赁房源信息
     * @param borrowHouse
     * @return
     */
    public int addBorrowHouse(BorrowHouse borrowHouse);

    /**
     * 修改房源信息
     * @param borrowHouse
     * @return
     */
    public int updateBorrowHouse(BorrowHouse borrowHouse);


    /**
     * 查询审核通过的可租赁房源的集合
     * @return
     */
    public List<BorrowHouseVO> findBorrowAll();
    /**
     * 通过租赁表编号查询具体的房源信息
     * @return
     */
    public BorrowHouseVO findBorrowByBrid(int brid);

    /**
     * 通过租赁表编号查询租赁表信息
     * @param brid
     * @return
     */
    public BorrowHouse findBorrowByBrid1(int brid);

}
