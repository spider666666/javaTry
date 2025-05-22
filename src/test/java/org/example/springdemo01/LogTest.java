package org.example.springdemo01;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    //创建日志对象
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Test
    void fact(){
        log.debug("开始计算");

        int i =0;
        int sum = 0;
        while(i<5){
            sum = sum+1;
            i = i + 1;
        }
        System.out.print(sum);
        log.info("计算结果为："+sum);
        log.debug("结束结算");

    }
}
/*
知识点：1.在日志的级别当中，trace是最低的，debug，info,......



 */