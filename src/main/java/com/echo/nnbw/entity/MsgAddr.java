package com.echo.nnbw.entity;

import javax.persistence.Entity;

/**
 * @author xujie17
 */
@Entity
public class MsgAddr extends BaseEntity {

    /**
     * 帖子ID
     */
    private Long MsgId;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 维度
     */
    private String latitude;


}
