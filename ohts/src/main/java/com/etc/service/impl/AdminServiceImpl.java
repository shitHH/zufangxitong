package com.etc.service.impl;

import com.etc.dao.AdminDao;
import com.etc.pojo.Admin;
import com.etc.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 管理员业务逻辑实现类
 * @date 2021/4/6  17:35
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminDao adminDao;

    @Override
    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    @Override
    public Admin findByAccountAndPass(String account, String pass) {
        return adminDao.findByAccountAndPass(account,pass);
    }

    @Override
    public boolean addAdmin(Admin admin) {
        return adminDao.addAdmin(admin)>0?true:false;
    }

    @Override
    public boolean update(Admin admin) {
        return adminDao.update(admin)>0?true:false;
    }

    @Override
    public boolean delete(int[] adids) {
        return adminDao.delete(adids)>0?true:false;
    }
}
