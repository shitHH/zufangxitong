package com.etc.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 买卖房源表类
 * @date 2021/4/6  16:13
 */
public class DealHouse {
    /**
     * 买卖房源表编号
     */
    private int dhid;
    /**
     * 房源编号
     */
    private int hid;
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uptime;
    /**
     * 付款方式
     */
    private String paytype;

    public int getDhid() {
        return dhid;
    }

    public void setDhid(int dhid) {
        this.dhid = dhid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
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

    public DealHouse() {
    }

    public DealHouse(int dhid, int hid, double unitprice, double hprice, Date uptime, String paytype) {
        this.dhid = dhid;
        this.hid = hid;
        this.unitprice = unitprice;
        this.hprice = hprice;
        this.uptime = uptime;
        this.paytype = paytype;
    }

    @Override
    public String toString() {
        return "DealHouse{" +
                "dhid=" + dhid +
                ", hid=" + hid +
                ", unitprice=" + unitprice +
                ", hprice=" + hprice +
                ", uptime=" + uptime +
                ", paytype='" + paytype + '\'' +
                '}';
    }
}
