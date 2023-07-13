package com.etc.service.impl;

import com.etc.dao.HouseDao;
import com.etc.pojo.House;
import com.etc.service.HouseService;
import com.etc.vo.HouseVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 房源业务逻辑实现类
 * @date 2021/4/7  14:41
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Resource
    HouseDao houseDao;
    @Override
    public List<House> findAllHouse() {
        return houseDao.findAllHouse();
    }


    @Override
    public House findByHid(int hid) {
        return houseDao.findByHid(hid);
    }

    @Override
    public boolean update(House house) {
        return houseDao.update(house)>0?true:false;
    }

    @Override
    public boolean addhouse(House house) {
        return houseDao.insert(house)>0?true:false;
    }

    @Override
    public List<HouseVO> findAll() {
        return houseDao.findAll();
    }

    @Override
    public HouseVO findByHid3(int hid) {
        return houseDao.findByHid3(hid);
    }

    @Override
    public List<HouseVO> findByUtid(int utid) {
        return houseDao.findByUtid(utid);
    }

    @Override
    public List<HouseVO> findtgAll() {
        return houseDao.findtgAll();
    }

    @Override
    public List<HouseVO> findwtgAll() {
        return houseDao.findwtgAll();
    }

    @Override
    public List<HouseVO> findtgByUtid(int utid) {
        return houseDao.findtgByUtid(utid);
    }

    @Override
    public List<House> findByUid(int uid) {
        return houseDao.findByUid(uid);
    }
}
