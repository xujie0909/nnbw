package com.echo.nnbw.service;

import com.echo.nnbw.entity.Msg;
import com.echo.nnbw.vo.MsgVo;

/**
 * @author xujie17
 */
public interface MsgService {


    /**
     * 发布消息
     *
     * @param msgVo 消息实体
     * @return 消息实体
     */
    Msg publishMsg(MsgVo msgVo);


}
