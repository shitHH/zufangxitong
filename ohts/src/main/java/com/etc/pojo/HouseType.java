package com.etc.pojo;

/**
 * @author lixiaobin
 * @version 1.0
 * @category  户型表
 * @date 2021/4/6  16:09
 */
public class HouseType {
    /**
     *  户型编号
     */
    private int tid;
    /**
     * 户型
     */
    private String type;

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
}
