package com.spacetim.middleware.server.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author spacetim
 * @date 2021/10/9
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private Integer bookNo;
    private String bookName;
}
