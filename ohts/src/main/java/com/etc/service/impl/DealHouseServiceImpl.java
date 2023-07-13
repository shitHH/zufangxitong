package com.etc.service.impl;

import com.etc.dao.DealHouseDao;
import com.etc.pojo.DealHouse;
import com.etc.service.DealHouseService;
import com.etc.vo.DealHouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Project：ohts
 * classname:DealHouseServiceImpl
 * Date：2021/4/7
 * Time：11:54
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 买卖房源的业务逻辑实现类
 */
@Service
public class DealHouseServiceImpl implements DealHouseService {

    @Autowired
    DealHouseDao dealHouseDao;
    @Override
    public List<DealHouse> findAll() {
        return dealHouseDao.findAll();
    }

    @Override
    public DealHouse findByDhid(int dhid) {
        return dealHouseDao.findByDhid(dhid);
    }

    @Override
    public DealHouse findByHid(int hid) {
        return dealHouseDao.findByHid(hid);
    }

    @Override
    public boolean addDealHouse(DealHouse dealHouse) {
        //增加上线时间
        dealHouse.setUptime(new Date(System.currentTimeMillis()));
        return dealHouseDao.addDealHouse(dealHouse)>0?true:false;
    }

    @Override
    public boolean updateDealHouse(DealHouse dealHouse) {
        return dealHouseDao.updateDealHouse(dealHouse)>0?true:false;
    }

    @Override
    public List<DealHouseVO> findAllByUtid(int utid) {
        return dealHouseDao.findAllByUtid(utid);
    }

    @Override
    public DealHouseVO findAllByhid3(int hid) {
        return dealHouseDao.findAllByhid3(hid);
    }


}
