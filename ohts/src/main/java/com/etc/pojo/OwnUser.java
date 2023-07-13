package com.etc.pojo;

/**
 * @Author: wangjuyuan
 * @Date: Created in 16:32 2021-04-06
 * @Description: 用户实体类
 * @Version: 1.0
 */
public class OwnUser {

    /**
     * 编号
     */
    private int uid;
    /**
     * 用户名
     */
    private String uname;
    /**
     * 性别
     */
    private String usex;
    /**
     * 电话
     */
    private String utel;
    /**
     * 密码
     */
    private String upass;
    /**
     * 年龄
     */
    private int uage;
    /**
     * 身份证号
     */
    private String ucard;
    /**
     * 真实姓名
     */
    private String name;
    /**
     * 角色编号
     */
    private int rid;
    /**
     * 经纪人编号
     */
    private int aid;

    public OwnUser() {
    }

    public OwnUser(int uid, String uname, String usex, String utel, String upass, int uage, String ucard, String name, int rid, int aid) {
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.utel = utel;
        this.upass = upass;
        this.uage = uage;
        this.ucard = ucard;
        this.name = name;
        this.rid = rid;
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUcard() {
        return ucard;
    }

    public void setUcard(String ucard) {
        this.ucard = ucard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "OwnUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", utel='" + utel + '\'' +
                ", upass='" + upass + '\'' +
                ", uage=" + uage +
                ", ucard='" + ucard + '\'' +
                ", name='" + name + '\'' +
                ", rid=" + rid +
                ", aid=" + aid +
                '}';
    }
}
