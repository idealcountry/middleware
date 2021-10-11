package com.spacetim.middleware.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author spacetim
 * @date 2021/10/11
 * @description
 */
@Data
public class Item {
    private Integer id;
    private String code;
    private String name;
    private Date createTime;
}
