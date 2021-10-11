package com.spacetim.middleware.server.dto;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * @author: zhonglinsen
 * @date: 2019/3/15
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RedPacketDto {

    private Integer userId;

    //指定多少人抢
    @NotNull
    private Integer total;

    //指定总金额-单位为分
    @NotNull
    private Integer amount;
}









































