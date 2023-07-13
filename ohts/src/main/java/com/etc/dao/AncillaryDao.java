package com.etc.dao;

import com.etc.pojo.Ancillary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 设施数据访问接口
 * @date 2021/4/6  19:41
 */
public interface AncillaryDao {
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
    public int addAncillary(Ancillary ancillary);


    /**
     * 删除设施
     * @param
     * @return
     */
    public int deleteAncillary(int[] anids);
}
