package com.spacetim.middleware.server.service;


import com.spacetim.middleware.server.dto.RedPacketDto;

import java.math.BigDecimal;

/**
 * @author: zhonglinsen
 * @date: 2019/3/15
 */
public interface IRedPacketService {

    String handOut(RedPacketDto dto) throws Exception;

    BigDecimal rob(Integer userId, String redId) throws Exception;
}
