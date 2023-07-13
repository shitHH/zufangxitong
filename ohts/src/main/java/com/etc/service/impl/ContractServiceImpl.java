package com.etc.service.impl;

import com.etc.dao.ContractDao;
import com.etc.pojo.Contract;
import com.etc.service.ContractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 李英
 * @date 2021-04-08
 * @category 合同业务逻辑实现类
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Resource
    ContractDao contractDao;
    @Override
    public List<Contract> findAll() {
        return contractDao.findAll();
    }

    @Override
    public Contract findByCid(int cid) {
        return contractDao.findByCid(cid);
    }

    @Override
    public List<Contract> findByUid(int uid) {
        return contractDao.findByUid(uid);
    }

    @Override
    public List<Contract> findByHid(int hid) {
        return contractDao.findByHid(hid);
    }

    @Override
    public Contract insertContract(Contract contract) {
        contract.setSigndate(new Timestamp(new Date().getTime()));
        int i = contractDao.insertContract(contract);
        if(i>0){
            return contract;
        }else {
            return null;
        }
    }

    @Override
    public boolean deleteContract(Contract contract) {
        return contractDao.deleteContract(contract)>0?true:false;
    }

    @Override
    public List<Contract> findByAid(int aid) {
        return contractDao.findByAid(aid);
    }

    @Override
    public Contract updateContract(Contract contract) {
        return contractDao.updateContract(contract)>0?contractDao.findByCid(contract.getCid()):null;
    }
}
