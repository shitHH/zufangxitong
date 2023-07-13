package com.etc.dao;

import com.etc.pojo.AUser;

import com.etc.vo.AuserVo;
import com.etc.vo.ChartAuserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 经纪人数据访问接口
 * @date 2021/4/7  9:03
 */
public interface AUserDao {
    /**
     * 查询所有经纪人
     *
     * @return
     */
    public List<AUser> findAll();

    /**
     * 通过经纪人编号查询经纪人信息
     *
     * @return
     */
    public AUser findByAid(int aid);

    /**
     * 通过账号密码判断经纪人是否存在
     *
     * @return
     */
    public AUser findByAtelAndApass(AUser aUser);

    /**
     * 通过角色名查询经纪人信息
     *
     * @return
     */
    public List<AuserVo> findByRolename(@Param("role") String role);

    /**
     * 增加经纪人
     *
     * @return
     */
    public int addAUser(AUser aUser);

    /**
     * 更新经纪人信息
     *
     * @return
     */
    public int updateAUser(AUser aUser);

    /**
     * 批量删除经纪人
     *
     * @param aids
     * @return
     */
    public int deleteAUser(int[] aids);

    /**
     * 根据经纪人系统号查询经纪人信息
     *
     * @param aid 系统号
     * @return 经纪人信息
     */
    public AuserVo findAuserRid(int aid);

    /**
     * 查询经纪人列表集合
     *
     * @return
     */
    public List<AuserVo> findAllAuser();


    /**
     * 通过用户编号查询经纪人信息
     *
     * @param uid
     * @return
     */
    public AuserVo findAuserByUid(int uid);

    /**
     * 通过角色编号找到这个经纪人对象
     *
     * @param rid
     * @return
     */
    public AuserVo findByRid(int rid);

    /**
     * 通过南丁格尔图展示
     *
     * @return
     */
    public List<ChartAuserVo> findAuserChart();

    /**
     * 获得用户的饼状图
     * @return
     */
     public List<ChartAuserVo> findOwnuserChart();

}
