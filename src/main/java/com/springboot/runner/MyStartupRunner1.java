package com.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 服务启动执行
 * Created by qlxrc on 2016/10/16.
 */
@Component
@Order(value=2) //@Order 注解的执行优先级是按value值从小到大顺序
public class MyStartupRunner1 implements CommandLineRunner {

    @Override
    public void run(String...args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作1111<<<<<<<<<<<<<");
    }
}
