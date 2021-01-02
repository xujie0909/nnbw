package com.echo.nnbw.entity;

import com.echo.nnbw.enums.StateEnum;

import javax.persistence.Entity;

/**
 * @author xujie17
 */
@Entity
public class Msg extends BaseEntity {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 父消息，B消息回复了A消息，则A消息是B的父消息
     */
    private String preMSgId;

    /**
     * 消息状态
     */
    private StateEnum state;

    /**
     * 是否允许回复(1:允许；0：不允许)
     */
    private Integer allowReply;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPreMSgId(String preMSgId) {
        this.preMSgId = preMSgId;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public void setAllowReply(Integer allowReply) {
        this.allowReply = allowReply;
    }
}
