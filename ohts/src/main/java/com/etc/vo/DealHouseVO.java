package com.etc.vo;

import java.util.Date;

/**
 * Project：ohts
 * classname:House
 * Date：2021/4/6
 * Time：20:37
 * Description：TODO
 *
 * @author lixaiobin
 * @version 1.0
 * @category 买卖房源VO类
 */
public class DealHouseVO {
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
     * 房源图片
     */
    private String houseimage;

    /**
     * 户型
     */
    public  String type;

    /**
     * 用途
     */
    public String usetype;

    /**
     * 买卖房源表编号
     */
    private int dhid;
    /**
     * 房屋单价
     */
    private double unitprice;
    /**
     * 房屋售价
     */
    private double hprice;
    /**
     * 上线时间
     */
    private Date uptime;
    /**
     * 付款方式
     */
    private String paytype;



    public DealHouseVO() {
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

    public String getHouseimage() {
        return houseimage;
    }

    public void setHouseimage(String houseimage) {
        this.houseimage = houseimage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public int getDhid() {
        return dhid;
    }

    public void setDhid(int dhid) {
        this.dhid = dhid;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getHprice() {
        return hprice;
    }

    public void setHprice(double hprice) {
        this.hprice = hprice;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    @Override
    public String toString() {
        return "DealHouseVO{" +
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
                ", houseimage='" + houseimage + '\'' +
                ", type='" + type + '\'' +
                ", usetype='" + usetype + '\'' +
                ", dhid=" + dhid +
                ", unitprice=" + unitprice +
                ", hprice=" + hprice +
                ", uptime=" + uptime +
                ", paytype='" + paytype + '\'' +
                '}';
    }
}
