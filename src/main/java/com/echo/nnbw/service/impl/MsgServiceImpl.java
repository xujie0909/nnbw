package com.echo.nnbw.service.impl;

import com.echo.nnbw.dao.MsgDao;
import com.echo.nnbw.entity.Msg;
import com.echo.nnbw.service.MsgService;
import com.echo.nnbw.vo.MsgVo;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author xujie17
 */
@Service
public class MsgServiceImpl implements MsgService {

    private final MsgDao msgDao;

    public MsgServiceImpl(MsgDao msgDao) {
        this.msgDao = msgDao;
    }

    @Override
    public Msg publishMsg(MsgVo msgVo) {
        Msg msg = msgVo.convert2Entity();
        msg.setCreateTime(new Date());
        msg.setUpdateTime(new Date());
        return msgDao.save(msg);
    }
}
