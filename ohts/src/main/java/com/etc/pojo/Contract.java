package com.etc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 李英
 * @Date: 2021-4-8
 * @Description: 合同表
 * @Version: 1.0
 */
public class Contract {

    /**
     * 合同编号
     */
    private int cid;
    /**
     * 买家编号
     */
    private int byuid;
    /**
     * 房屋编号
     */
    private int hid;
    /**
     * 房屋用途(租赁/买卖)
     */
    private String useto;
    /**
     * 卖家编号
     */
    private int sauid;
    /**
     * 签约日期
     */
    @DateTimeFormat(pattern = "yyyy-mm-dd hh:mm:ss")
    private Date  signdate;
    /**
     * 经纪人编号
     */
    private int aid;
    /**
     * 成交价格
     */
    private int price;
    public Contract() {
    }

    public Contract(int cid, int byuid, int hid, String useto, int sauid, Date signdate, int aid) {
        this.cid = cid;
        this.byuid = byuid;
        this.hid = hid;
        this.useto = useto;
        this.sauid = sauid;
        this.signdate = signdate;
        this.aid = aid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getByuid() {
        return byuid;
    }

    public void setByuid(int byuid) {
        this.byuid = byuid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getUseto() {
        return useto;
    }

    public void setUseto(String useto) {
        this.useto = useto;
    }

    public int getSauid() {
        return sauid;
    }

    public void setSauid(int sauid) {
        this.sauid = sauid;
    }

    public Date getSigndate() {
        return signdate;
    }

    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Contract(int cid, int byuid, int hid, String useto, int sauid, Date signdate, int aid, int price) {
        this.cid = cid;
        this.byuid = byuid;
        this.hid = hid;
        this.useto = useto;
        this.sauid = sauid;
        this.signdate = signdate;
        this.aid = aid;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Contract{" +
                "cid=" + cid +
                ", byuid=" + byuid +
                ", hid=" + hid +
                ", useto='" + useto + '\'' +
                ", sauid=" + sauid +
                ", signdate=" + signdate +
                ", aid=" + aid +
                ", price=" + price +
                '}';
    }
}
