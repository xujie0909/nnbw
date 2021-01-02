package com.echo.nnbw.enums;

/**
 * @author xujie17
 */

public enum StateEnum {

    /**
     *消息创建
     */
    MSG_CREATE(0001, "消息创建"),

    /**
     * 消息合法
     */
    MSG_LEGAL(0002, "消息合法"),

    /**
     * 消息非法
     */
    MSG_ILLEGAL(0003, "消息非法"),




    ;

    /**
     * 状态码
     */
    private Integer stateCode;

    /**
     * 状态描述
     */
    private String stateDesc;

    StateEnum(Integer stateCode, String stateDesc) {
        this.stateCode = stateCode;
        this.stateDesc = stateDesc;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public String getStateDesc() {
        return stateDesc;
    }
}
