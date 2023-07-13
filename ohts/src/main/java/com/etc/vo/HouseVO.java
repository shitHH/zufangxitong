package com.etc.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 房屋的vo类
 * @date 2021/4/7  14:56
 */
public class HouseVO {
    /**
     * 房源编号
     */
    private int hid;
    /**
     * 房屋租赁编号
     */
    private int brid;
    /**
     * 业主编号
     */
    private int uid;
    /**
     * 户型编号
     */
    private int tid;
    /**
     * 户型
     */
    private String type;
    /**
     * 用途类型编号
     */
    private  int utid;
    /**
     * 用途
     */
    private String usetype;
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
     * 建成时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hyear;
    /**
     * 楼层
     */
    private String hfloor;
    /**
     * 装修
     */
    private String fitment;
    /**
     * 产权
     */
    private String property;
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

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUtid() {
        return utid;
    }

    public void setUtid(int utid) {
        this.utid = utid;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
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

    public Date getHyear() {
        return hyear;
    }

    public void setHyear(Date hyear) {
        this.hyear = hyear;
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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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

    public int getBrid() {
        return brid;
    }

    public void setBrid(int brid) {
        this.brid = brid;
    }

    @Override
    public String toString() {
        return "HouseVO{" +
                "hid=" + hid +
                ", uid=" + uid +
                ", tid=" + tid +
                ", type='" + type + '\'' +
                ", utid=" + utid +
                ", usetype='" + usetype + '\'' +
                ", harea='" + harea + '\'' +
                ", aspect='" + aspect + '\'' +
                ", plot='" + plot + '\'' +
                ", hyear=" + hyear +
                ", hfloor='" + hfloor + '\'' +
                ", fitment='" + fitment + '\'' +
                ", property='" + property + '\'' +
                ", ispass='" + ispass + '\'' +
                ", ancilary='" + ancilary + '\'' +
                ", houseimage='" + houseimage + '\'' +
                '}';
    }
}
