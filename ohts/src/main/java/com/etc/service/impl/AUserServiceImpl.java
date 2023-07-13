package com.etc.service.impl;

import com.etc.dao.AUserDao;
import com.etc.pojo.AUser;
import com.etc.service.AUserService;
import com.etc.vo.AuserVo;
import com.etc.vo.ChartAuserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 经纪人业务逻辑实现类
 * @date 2021/4/7  12:10
 */
@Service
public class AUserServiceImpl implements AUserService {
    @Resource
    AUserDao aUserDao;

    @Override
    public List<AUser> findAll() {
        return aUserDao.findAll();
    }

    @Override
    public AUser findByAid(int aid) {
        return aUserDao.findByAid(aid);
    }

    @Override
    public AUser findByAtelAndApass(AUser aUser) {
        return aUserDao.findByAtelAndApass(aUser);
    }


    @Override
    public List<AuserVo> findByRolename(String role) {
        return aUserDao.findByRolename(role);
    }

    @Override
    public boolean addAUser(AUser aUser) {
        return aUserDao.addAUser(aUser) > 0 ? true : false;
    }

    @Override
    public boolean updateAUser(AUser aUser) {
        return aUserDao.updateAUser(aUser) > 0 ? true : false;
    }

    @Override
    public boolean deleteAUser(int[] aids) {
        return aUserDao.deleteAUser(aids) > 0 ? true : false;
    }

    @Override
    public List<AuserVo> findAllAuser() {
        return aUserDao.findAllAuser();
    }

    @Override
    public AuserVo findAuserByUid(int uid) {
        return aUserDao.findAuserByUid(uid);
    }

    @Override
    public AuserVo findByRid(int rid) {
        return aUserDao.findByRid(rid);
    }

    @Override
    public List<ChartAuserVo> findAuserChart() {
        return aUserDao.findAuserChart();
    }

    @Override
    public List<ChartAuserVo> findOwnuserChart() {
        return aUserDao.findOwnuserChart();
    }


}
