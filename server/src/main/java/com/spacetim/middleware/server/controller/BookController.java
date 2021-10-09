package com.spacetim.middleware.server.controller;

import com.spacetim.middleware.server.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spacetim
 * @date 2021/10/9
 * @description
 */
@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {
    /**
     * 获取书籍信息
     * @param bookInfo
     * @param bookName
     * @return
     */
    @RequestMapping("/info")
    public Book getInfo(Integer bookInfo,String bookName){
        Book book = new Book();
        book.setBookNo(bookInfo);
        book.setBookName(bookName);
        return book;
    }
}
