package com.etc.pojo;

/**
 * @Author: wangjuyuan
 * @Date: Created in 15:57 2021-04-06
 * @Description: 管理员实体类
 * @Version: 1.0
 */
public class Admin {
    /**
     * 管理员编号
     */
    private int adid;
    /**
     * 管理员账号
     */
    private String account;
    /**
     * 管理员密码
     */
    private String pass;

    public Admin() {
    }

    public Admin(String account, String pass) {
        this.account = account;
        this.pass = pass;
    }

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adid=" + adid +
                ", account='" + account + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
