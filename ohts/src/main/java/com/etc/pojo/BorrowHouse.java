package com.etc.pojo;

import java.sql.Date;

/**
 * @Author: wangjuyuan
 * @Date: Created in 16:41 2021-04-06
 * @Description: 房屋租赁实体类
 * @Version: 1.0
 */
public class BorrowHouse {
    /**
     * 房屋租赁编号
     */
    private int brid;
    /**
     * 用户编号
     */
    private int uid;
    /**
     * 房屋编号
     */
    private int hid;
    /**
     * 租金
     */
    private double rent;
    /**
     * 租赁方式
     */
    private String brtype;
    /**
     * 入住时间
     */
    private Date utime;
    /**
     * 付款方式
     */
    private String ptype;
    /**
     * 配套设施
     */
    private String ancillary;
    /**
     * 备注
     */
    private String remark;


    public BorrowHouse() {
    }

    public BorrowHouse(int brid, int uid, int hid, double rent, String brtype, Date utime, String ptype, String ancillary, String remark) {
        this.brid = brid;
        this.uid = uid;
        this.hid = hid;
        this.rent = rent;
        this.brtype = brtype;
        this.utime = utime;
        this.ptype = ptype;
        this.ancillary = ancillary;
        this.remark = remark;
    }

    public int getBrid() {
        return brid;
    }

    public void setBrid(int brid) {
        this.brid = brid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getBrtype() {
        return brtype;
    }

    public void setBrtype(String brtype) {
        this.brtype = brtype;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getAncillary() {
        return ancillary;
    }

    public void setAncillary(String ancillary) {
        this.ancillary = ancillary;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BorrowHouse{" +
                "brid=" + brid +
                ", uid=" + uid +
                ", hid=" + hid +
                ", rent=" + rent +
                ", brtype='" + brtype + '\'' +
                ", utime=" + utime +
                ", ptype='" + ptype + '\'' +
                ", ancillary='" + ancillary + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
