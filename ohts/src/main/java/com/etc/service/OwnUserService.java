package com.etc.service;

import com.etc.pojo.OwnUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李英
 * @date 2021-04-07
 * @category 用户业务逻辑接口
 */
public interface OwnUserService {
    /**
     * 用户根据电话和密码进行登录
     *
     * @param utel  用户电话
     * @param upass 用户密码
     * @return 用户对象
     */
    public OwnUser findUser(@Param(value = "utel") String utel, @Param(value = "upass") String upass);

    /**
     * 添加一个新用户
     *
     * @param user 用户对象
     * @return 添加的用户对象
     */
    public boolean addUser(OwnUser user);
    /**
     * 对用户信息进行更新
     *
     * @param user 用户对象
     * @return 更新后的用户对象
     */
    public boolean update(OwnUser user);
    /**
     * 查询所有的用户
     *
     * @return 所有的用户列表
     */
    public List<OwnUser> findAll();
    /**
     * 根据用户ID查找用户对象
     *
     * @param uid 用户编号
     * @return 用户对象
     */
    public OwnUser findByid(int uid);

    /**
     * 根据用户姓名进行模糊查询
     *
     * @param uname 用户名字的一个字段
     * @return 用户列表
     */
    public List<OwnUser> findUserList(@Param(value = "uname") String uname);

    /**
     * 根据用户注册姓名进行模糊查询
     *
     * @param name 用户注册名字的一个字段
     * @return 用户列表
     */
    public List<OwnUser> findNameList(@Param(value = "name") String name);

    /**
     * 查找经纪人名下的所有用户
     * @param aid 经纪人ID
     * @return 用户列表
     */
    public List<OwnUser> findOwnUserList(int rid,int aid);

    /**
     * 根据aid查询所有用户
     *
     * @param aid 经纪人ID
     * @return 用户集合
     */
    public List<OwnUser> findAllOwnUserByAid(int aid);

    /**
     * 根据角色编号查询 查询对应的角色列表
     * @param rid 角色编号
     * @return 角色列表
     */
    public List<OwnUser> findByRid(int rid);

}

