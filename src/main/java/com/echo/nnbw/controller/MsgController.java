package com.echo.nnbw.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.echo.nnbw.common.Response;
import com.echo.nnbw.entity.Msg;
import com.echo.nnbw.service.MsgService;
import com.echo.nnbw.vo.MsgVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author xujie17
 */
@RestController
@RequestMapping(value = "/msg")
public class MsgController {

    private final MsgService msgService;

    public MsgController(MsgService msgService) {
        this.msgService = msgService;
    }

    @PostMapping(value = "/publish")
    public Response<Msg> publishMsg(@RequestBody JSONObject msgVoStr) {
        MsgVo msgVo = JSON.parseObject(msgVoStr.toJSONString(), MsgVo.class);
        return new Response<>(msgService.publishMsg(msgVo));
    }

}
