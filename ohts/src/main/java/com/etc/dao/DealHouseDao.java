package com.etc.dao;

import com.etc.pojo.DealHouse;
import com.etc.vo.DealHouseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Project：ohts
 * classname:DealHouseDao
 * Date：2021/4/6
 * Time：20:32
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 买卖房源数据访问接口
 */
public interface DealHouseDao {
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
    public int addDealHouse(DealHouse dealHouse);

    /**
     * 修改房源信息
     * @param dealHouse
     * @return
     */
    public int updateDealHouse(DealHouse dealHouse);

    /**
     * 根据用途编号查询所有审核通过的买卖房屋
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
