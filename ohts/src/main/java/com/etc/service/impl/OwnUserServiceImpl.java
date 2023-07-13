package com.etc.service.impl;

import com.etc.dao.OwnUserDao;
import com.etc.pojo.OwnUser;
import com.etc.service.OwnUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.*;
import java.util.List;

/**
 * @author 李英
 * @date 2021-04-07
 * @category 用户业务逻辑实现类
 */
@Service
public class OwnUserServiceImpl implements OwnUserService {
    @Resource
    OwnUserDao ownUserDao;

    @Override
    public OwnUser findUser(String utel, String upass) {
        return ownUserDao.findUser(utel, upass);
    }

    @Override
    public boolean addUser(OwnUser user) {
        int i = ownUserDao.addUser(user);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(OwnUser user) {
        int i = ownUserDao.update(user);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<OwnUser> findAll() {
        return ownUserDao.findAll();
    }

    @Override
    public OwnUser findByid(int uid) {
        return ownUserDao.findByid(uid);
    }

    @Override
    public List<OwnUser> findUserList(String uname) {
        return ownUserDao.findUserList(uname);
    }

    @Override
    public List<OwnUser> findNameList(String name) {
        return ownUserDao.findNameList(name);
    }

    @Override
    public List<OwnUser> findOwnUserList(int rid, int aid) {
        return ownUserDao.findOwnUserList(rid, aid);
    }

    @Override
    public List<OwnUser> findAllOwnUserByAid(int aid) {
        return ownUserDao.findAllOwnUserByAid(aid);
    }

    @Override
    public List<OwnUser> findByRid(int rid) {
        return ownUserDao.findByRid(rid);
    }
}
