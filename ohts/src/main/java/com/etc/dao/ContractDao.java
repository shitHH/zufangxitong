package com.etc.dao;

import com.etc.pojo.Contract;

import java.util.List;

/**
 * @author yyf
 * 合同接口
 */
public interface ContractDao {
    /**
     * 查询合同的所有信息
     *
     * @return 合同列表
     */
    public List<Contract> findAll();


    /**
     * 根据合同的编号查询合同的对象
     *
     * @param cid 合同编号
     * @return 合同对象
     */
    public Contract findByCid(int cid);

    /**
     * 根据用户的编号查询到和用户相关的信息
     *
     * @param uid 买家的ID
     * @return 合同列表
     */
    public List<Contract> findByUid(int uid);

    /**
     * 根据房屋的编号查询到这个合同的信息
     *
     * @param hid 房屋ID
     * @return 合同列表
     */
    public List<Contract> findByHid(int hid);

    /**
     * 添加合同，返回受影响行数
     *
     * @param contract 合同对象
     * @return 受影响行数
     */
    public int insertContract(Contract contract);

    /**
     * 删除合同信息
     *
     * @param contract 合同对象
     * @return 受影响行数
     */
    public int deleteContract(Contract contract);


    /**
     * 查询经纪人名下的所有合同
     * @param aid 经纪人编号
     * @return 合同列表
     */
    public List<Contract> findByAid(int aid);

    /**
     * 更新合同
     * @param contract 合同对象
     * @return 受影响的行数
     */
    public int updateContract(Contract contract);

}
