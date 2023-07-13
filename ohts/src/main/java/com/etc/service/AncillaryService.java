package com.etc.service;

import com.etc.pojo.Ancillary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 设施业务逻辑接口
 * @date 2021/4/7  11:57
 */
public interface AncillaryService {
    /**
     * 查询所有设施
     * @return
     */
    public List<Ancillary> findAll();

    /**
     * 通过设施名字查询具体设施
     * @param ancillary
     * @return
     */
    public  List<Ancillary> findByAncillary(@Param("ancillary") String ancillary);

    /**
     * 增加设施
     * @param ancillary
     * @return
     */
    public boolean addAncillary(Ancillary ancillary);


    /**
     * 删除设施
     * @param
     * @return
     */
    public boolean deleteAncillary(int[] anids);
}
