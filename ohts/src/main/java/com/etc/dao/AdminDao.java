package com.etc.dao;

import com.etc.pojo.Admin;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 管理员数据访问接口
 * @date 2021/4/6  17:43
 */

public interface AdminDao {
    /**
     * 查询所有管理员
     * @return
     */
    public List<Admin>  findAll();

    /**
     * 通过管理员账号和密码查询管理员，登录
     * @return
     */
    public Admin findByAccountAndPass(@Param("account") String account,@Param("pass") String pass);

    /**
     * 注册
     * @param admin
     * @return
     */
    public int addAdmin(Admin admin);

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    public int update(Admin admin);

    /**
     * 批量删除管理员
     * @param adids
     * @return
     */
    public int delete(int[] adids);
}
