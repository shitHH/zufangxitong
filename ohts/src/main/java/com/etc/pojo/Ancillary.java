package com.etc.pojo;

/**
 * @Author: wangjuyuan
 * @Date: Created in 16:00 2021-04-06
 * @Description: 配套设施实体类
 * @Version: 1.0
 */
public class Ancillary {

    /**
     * 设施编号
     */
    private int anid;

    /**
     * 设施名称
     */
    private String ancillary;

    public int getAnid() {
        return anid;
    }

    public void setAnid(int anid) {
        this.anid = anid;
    }

    public String getAncillary() {
        return ancillary;
    }

    public void setAncillary(String ancillary) {
        this.ancillary = ancillary;
    }

    public Ancillary() {
    }

    public Ancillary(String ancillary) {
        this.ancillary = ancillary;
    }
}
