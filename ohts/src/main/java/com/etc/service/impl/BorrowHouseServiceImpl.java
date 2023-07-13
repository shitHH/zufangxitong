package com.etc.service.impl;

import com.etc.dao.BorrowHouseDao;
import com.etc.pojo.BorrowHouse;
import com.etc.service.BorrowHouseService;
import com.etc.vo.BorrowHouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project：ohts
 * classname:BorrowHouseServiceImpl
 * Date：2021/4/7
 * Time：11:19
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 租赁的业务逻辑实现类
 */
@Service
public class BorrowHouseServiceImpl implements BorrowHouseService {

    @Autowired
    BorrowHouseDao borrowHouseDao;

    @Override
    public List<BorrowHouseVO> findAll() {
        return borrowHouseDao.findAll();
    }

    @Override
    public BorrowHouseVO findByBrid(int brid) {
        return borrowHouseDao.findByBrid(brid);
    }

    @Override
    public BorrowHouse findByid(int brid) {
        return borrowHouseDao.findByid(brid);
    }

    @Override
    public BorrowHouseVO findByHid(int hid) {
        return borrowHouseDao.findByHid(hid);
    }
    @Override
    public boolean addBorrowHouse(BorrowHouse borrowHouse) {
        return borrowHouseDao.addBorrowHouse(borrowHouse)>0?true:false;
    }

    @Override
    public boolean updateBorrowHouse(BorrowHouse borrowHouse) {
        return borrowHouseDao.updateBorrowHouse(borrowHouse)>0?true:false;
    }

    @Override
    public List<BorrowHouseVO> findBorrowAll() {
        return borrowHouseDao.findBorrowAll();
    }

    @Override
    public BorrowHouseVO findBorrowByBrid(int brid) {
        return borrowHouseDao.findBorrowByBrid(brid);
    }

    @Override
    public BorrowHouse findBorrowByBrid1(int brid) {
        return borrowHouseDao.findBorrowByBrid1(brid);
    }
}
