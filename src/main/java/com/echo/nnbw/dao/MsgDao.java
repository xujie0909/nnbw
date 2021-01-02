package com.echo.nnbw.dao;

import com.echo.nnbw.entity.Msg;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xujie17
 */
public interface MsgDao extends JpaRepository<Msg, Long> {
}
