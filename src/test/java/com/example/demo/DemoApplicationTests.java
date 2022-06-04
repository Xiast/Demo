package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class DemoApplicationTests {

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        logger.trace("trace 日志");
        logger.debug("debug 日志");
        logger.info("info 日志");

        logger.warn("注意个人信息安全！");
        logger.error("error错误警告通知！");


    }



}
