package com.etc.pojo;

/**
 * @Author: wangjuyuan
 * @Date: Created in 16:39 2021-04-06
 * @Description: 经纪人实体类
 * @Version: 1.0
 */
public class AUser {

    /**
     * 经纪人编号
     */
    private int aid;
    /**
     * 电话
     */
    private String atel;
    /**
     * 密码
     */
    private String apass;
    /**
     * 姓名
     */
    private String aname;
    /**
     * 性别
     */
    private String asex;
    /**
     * 年龄
     */
    private int aage;
    /**
     * 身份证号
     */
    private String acard;
    /**
     * 角色编号
     */
    private int rid;



    public AUser() {
    }

    public AUser(String atel, String apass, String aname, String asex, int aage, String acard, int rid) {
        this.atel = atel;
        this.apass = apass;
        this.aname = aname;
        this.asex = asex;
        this.aage = aage;
        this.acard = acard;
        this.rid = rid;
    }


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex;
    }

    public int getAage() {
        return aage;
    }

    public void setAage(int aage) {
        this.aage = aage;
    }

    public String getAcard() {
        return acard;
    }

    public void setAcard(String acard) {
        this.acard = acard;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }



    @Override
    public String toString() {
        return "AUser{" +
                "aid=" + aid +
                ", atel='" + atel + '\'' +
                ", apass='" + apass + '\'' +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", aage=" + aage +
                ", acard='" + acard + '\'' +
                ", rid=" + rid +
                '}';
    }
}
