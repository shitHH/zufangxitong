package com.etc.service;

import com.etc.pojo.DealHouse;
import com.etc.vo.DealHouseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Project：ohts
 * classname:DealHouseService
 * Date：2021/4/7
 * Time：11:50
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 买卖房源的业务逻辑接口
 */
public interface DealHouseService{
    /**
     * 查找所有买卖房源的集合
     * @return
     */
    public List<DealHouse> findAll();
    /**
     * 通过买卖房源Id查询买卖房源信息
     * @param dhid 买卖房源Id
     * @return
     */
    public DealHouse findByDhid(int dhid);
    /**
     * 通过房屋编号查询买卖房屋信息
     * @param hid
     * @return
     */
    public DealHouse findByHid(int hid);
    /**
     * 增加买卖房源信息
     * @param dealHouse
     * @return
     */
    public boolean addDealHouse(DealHouse dealHouse);
    /**
     * 修改房源信息
     * @param dealHouse
     * @return
     */
    public boolean updateDealHouse(DealHouse dealHouse);

    /**
     * 根据用途编号查询所有买卖房屋
     * @param utid
     * @return
     */
    public List<DealHouseVO> findAllByUtid(int utid);
    /**
     * 根据房屋编号查询买卖房屋的详细信息
     * @return
     */
    public DealHouseVO findAllByhid3( int hid);

}
