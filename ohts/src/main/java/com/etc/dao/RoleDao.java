package com.etc.dao;

import com.etc.pojo.Role;

import java.util.List;

/**
 * @author 李英
 * @date 2021-04-06
 * @category 用户角色表的dao
 */
public interface RoleDao {
    /**
     * 查找所有的角色列表
     * @return 角色列表
     */
    public List<Role> findAll();

    /**
     * 增加新角色
     * @param role 角色类
     * @return 受影响的行数
     */
    public int addRole(Role role);

    /**
     * 删除一个角色
     * @param role 角色类
     * @return 受影响的行数
     */
    public int delete(Role role);

    /**
     * 更新一个角色
     * @param role 角色类
     * @return 受影响的行数
     */
    public int update(Role role);
}
