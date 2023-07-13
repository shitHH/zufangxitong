package com.etc.service.impl;

import com.etc.dao.AncillaryDao;
import com.etc.pojo.Ancillary;
import com.etc.service.AncillaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category
 * @date 2021/4/7  11:59
 */
@Service
public class AncillaryServiceImpl implements AncillaryService {
    @Resource
    AncillaryDao ancillaryDao;
    @Override
    public List<Ancillary> findAll() {
        return ancillaryDao.findAll();
    }

    @Override
    public List<Ancillary> findByAncillary(String ancillary) {
        return ancillaryDao.findByAncillary(ancillary);
    }

    @Override
    public boolean addAncillary(Ancillary ancillary) {
        return ancillaryDao.addAncillary(ancillary)>0?true:false;
    }

    @Override
    public boolean deleteAncillary(int[] anids) {
        return ancillaryDao.deleteAncillary(anids)>0?true:false;
    }
}
