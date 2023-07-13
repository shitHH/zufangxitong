package com.etc.vo;

import java.sql.Date;

/**
 * Project：ohts
 * classname:BorrowHouseVO
 * Date：2021/4/6
 * Time：18:35
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 租赁房源的VO类
 */
public class BorrowHouseVO {

    /**
     * 房屋租赁编号
     */
    private int brid;
    /**
     * 用户编号
     */
    private int uid;
    /**
     * 业主姓名
     */
    private String uname;
    /**
     * 房屋编号
     */
    private int hid;
    /**
     * 用途类型编号
     */
    private  int utid;
    /**
     * 户型
     */
    private String type;
    /**
     * 户型编号
     */
    private int tid;
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
     * 建筑面积
     */
    private String harea;
    /**
     * 朝向
     */
    private String aspect;
    /**
     * 地址
     */
    private String plot;
    /**
     * 楼层
     */
    private String hfloor;
    /**
     * 装修
     */
    private String fitment;
    /**
     * 是否通过审核
     */
    private String ispass;
    /**
     * 配套设施
     */
    private String ancilary;
    /**
     * 房源图片
     */
    private String houseimage;
    /**
     * 租赁房源备注
     */
    private String remark;
    /**
     * 用途
     */
    private String usetype;
    /**
     * 建成时间
     */
    private java.util.Date hyear;
    /**
     * 产权
     */
    private String property;

    public BorrowHouseVO() {
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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
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

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getHfloor() {
        return hfloor;
    }

    public void setHfloor(String hfloor) {
        this.hfloor = hfloor;
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment;
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass;
    }

    public String getAncilary() {
        return ancilary;
    }

    public void setAncilary(String ancilary) {
        this.ancilary = ancilary;
    }

    public String getHouseimage() {
        return houseimage;
    }

    public void setHouseimage(String houseimage) {
        this.houseimage = houseimage;
    }

    public String getRemark() {
        return remark;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public java.util.Date getHyear() {
        return hyear;
    }

    public void setHyear(java.util.Date hyear) {
        this.hyear = hyear;
    }

    public BorrowHouseVO(double rent, String brtype, String ptype, String ancillary, String remark) {
        this.rent = rent;
        this.brtype = brtype;
        this.ptype = ptype;
        this.ancillary = ancillary;
        this.remark = remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getUtid() {
        return utid;
    }

    public void setUtid(int utid) {
        this.utid = utid;
    }

    @Override
    public String toString() {
        return "BorrowHouseVO{" +
                "brid=" + brid +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", hid=" + hid +
                ", type='" + type + '\'' +
                ", tid=" + tid +
                ", rent=" + rent +
                ", brtype='" + brtype + '\'' +
                ", utime=" + utime +
                ", ptype='" + ptype + '\'' +
                ", ancillary='" + ancillary + '\'' +
                ", harea='" + harea + '\'' +
                ", aspect='" + aspect + '\'' +
                ", plot='" + plot + '\'' +
                ", hfloor='" + hfloor + '\'' +
                ", fitment='" + fitment + '\'' +
                ", ispass='" + ispass + '\'' +
                ", ancilary='" + ancilary + '\'' +
                ", houseimage='" + houseimage + '\'' +
                ", remark='" + remark + '\'' +
                ", usetype='" + usetype + '\'' +
                ", hyear=" + hyear +
                ", property='" + property + '\'' +
                '}';
    }
}
