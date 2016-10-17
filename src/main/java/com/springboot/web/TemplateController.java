package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 模板测试.
 * Created by qlxrc on 2016/10/16.
 */
@Controller
public class TemplateController {

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","fromTemplateController.helloHtml...");
        return "/helloHtml";
    }

    /**
     * 返回html模板.
     */
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("hello","fromTemplateController.helloFtl");
        return "/helloFtl";
    }
}
