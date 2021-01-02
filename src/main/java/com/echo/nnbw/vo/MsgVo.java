package com.echo.nnbw.vo;

import com.echo.nnbw.entity.Msg;
import com.echo.nnbw.enums.StateEnum;
import lombok.Data;

/**
 * @author xujie17
 */
@Data
public class MsgVo {

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
     * 是否允许回复
     */
    private boolean allowCallBack;

    /**
     * 将试图对象转换成持久化对象
     *
     * @return 持久化对象
     */
    public Msg convert2Entity() {
        Msg msg = new Msg();
        msg.setUserId(this.userId);
        msg.setState(StateEnum.MSG_CREATE);
        msg.setAllowReply(this.allowCallBack ? 1 : 0);
        msg.setContent(this.content);
        msg.setPreMSgId(this.preMSgId);
        return msg;
    }


}
