package com.etc.vo;

/**
 * @author 贠一凡
 * @date 2021/4/7
 * @category
 */
public class AuserVo {
    /**
     * 经纪人系统号
     */
    private int aid;
    /**
     * 角色编号
     */
    private int rid;
    /**
     * 经纪人角色
     */
    private String role;
    /**
     * 经纪人电话号码
     */
    private String atel;

    /**
     * 经纪人名字
     */
    private String aname;
    /**
     * 经纪人性别
     */
    private String asex;
    /**
     * 年龄
     */
    private int aage;
    /**
     * 身份证号码
     */
    private String acard;

    public AuserVo() {
    }

    public AuserVo(int aid, String role, String atel, String aname, String asex, int aage, String acard) {
        this.aid = aid;
        this.role = role;
        this.atel = atel;
        this.aname = aname;
        this.asex = asex;
        this.aage = aage;
        this.acard = acard;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
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
        return "AuserVo{" +
                "aid=" + aid +
                ", rid=" + rid +
                ", role='" + role + '\'' +
                ", atel='" + atel + '\'' +
                ", aname='" + aname + '\'' +
                ", asex='" + asex + '\'' +
                ", aage=" + aage +
                ", acard='" + acard + '\'' +
                '}';
    }
}
