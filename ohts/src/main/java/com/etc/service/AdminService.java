package com.etc.service;

import com.etc.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 管理员业务逻辑接口
 * @date 2021/4/6  17:34
 */
public interface AdminService {
    /**
     * 查询所有管理员
     * @return
     */
    public List<Admin> findAll();

    /**
     * 通过管理员账号和密码查询管理员，登录
     * @return
     */
    public Admin findByAccountAndPass(@Param("account") String account, @Param("pass") String pass);

    /**
     * 注册
     * @param admin
     * @return
     */
    public boolean addAdmin(Admin admin);

    /**
     * 更新管理员信息
     * @param admin
     * @return
     */
    public boolean update(Admin admin);

    /**
     * 批量删除管理员
     * @param adids
     * @return
     */
    public boolean delete(int[] adids);
}
