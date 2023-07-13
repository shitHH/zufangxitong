package com.etc.vo;

/**
 * @author 贠一凡
 * @date 2021/4/9
 * @category 此区域经纪人的角色南丁格尔图
 */
public class ChartAuserVo {
    /**
     * 角色的名称
     */
    private String name;

    /**
     * 对应的经纪人列表中的角色及区域管理者
     */
    private int value;

    public ChartAuserVo() {
    }

    public ChartAuserVo(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
