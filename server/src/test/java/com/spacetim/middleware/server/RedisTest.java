package com.spacetim.middleware.server;

import com.spacetim.middleware.server.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


/**
 * @author spacetim
 * @date 2021/10/9
 * @description
 */
@Slf4j
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testOne(){
        log.info("Start Redis Practice-------");

        redisTemplate.opsForValue().set("redis:template:one:string", "RedisTemplate练习字符串信息");

        System.out.println(redisTemplate.opsForValue().get("redis:template:one:string"));
        Book book = Book.builder().bookNo(123)
                .bookName("你好")
                .build();

        ValueOperations valueOp = redisTemplate.opsForValue();
        valueOp.set("this", 123456);
        valueOp.set("object", book);

        System.out.println(valueOp.get("this"));
        System.out.println(valueOp.get("object"));


    }
}
