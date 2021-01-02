package com.echo.nnbw.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author xujie17
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * 唯一主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
