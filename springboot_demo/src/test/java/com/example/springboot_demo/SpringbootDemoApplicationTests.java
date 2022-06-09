package com.example.springboot_demo;


import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * springboot使用slf4j作为日志门面，logback作为实现
 */
@SpringBootTest
class SpringbootDemoApplicationTests {

    //记录器
    public static final Logger LOGGER =    LoggerFactory.getLogger(SpringbootDemoApplicationTests.class);
    @Test
    void contextLoads() {

        // 框架默认的日志
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info"); // 默认日志级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        //log4j2
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringbootDemoApplicationTests.class);
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
        logger.debug("debug");
        logger.trace("trace");


    }

}
