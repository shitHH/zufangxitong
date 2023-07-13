package com.etc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Project：ohts
 * classname:House
 * Date：2021/4/6
 * Time：16:11
 * Description：TODO
 *
 * @author 王永祺
 * @version 1.0
 * @category 房源实体类
 */
public class House {
    /**
     * 房源编号
     */
    private int hid;
    /**
     * 业主编号
     */
    private int uid;
    /**
     * 户型编号
     */
    private int tid;
    /**
     * 用途类型编号
     */
    private int utid;
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
    public House() {
    }

    public House(int hid, int uid, int tid, int utid, String harea, String aspect, String plot, Date hyear, String hfloor, String fitment, String property, String ispass, String ancilary, String houseimage) {
        this.hid = hid;
        this.uid = uid;
        this.tid = tid;
        this.utid = utid;
        this.harea = harea;
        this.aspect = aspect;
        this.plot = plot;
        this.hyear = hyear;
        this.hfloor = hfloor;
        this.fitment = fitment;
        this.property = property;
        this.ispass = ispass;
        this.ancilary = ancilary;
        this.houseimage = houseimage;
    }

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

    public int getUtid() {
        return utid;
    }

    public void setUtid(int utid) {
        this.utid = utid;
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

    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", uid=" + uid +
                ", tid=" + tid +
                ", utid=" + utid +
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
