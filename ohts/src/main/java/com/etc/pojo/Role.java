package com.etc.pojo;

/**
 * @author lixiaobin
 * @version 1.0
 * @category 角色表
 * @date 2021/4/6  16:11
 */
public class Role {
    /**
     * 角色编号
     */
    private int rid;
    /**
     * 角色名称
     */
    private String role;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
