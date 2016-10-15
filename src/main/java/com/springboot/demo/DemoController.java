package com.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qlxrc on 2016/10/15.
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String hello(){
        return"Hello World!!!";
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
