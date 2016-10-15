package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by qlxrc on 2016/10/15.
 */

@Controller
public class JspConteoller {

    @RequestMapping("/index")
    public String index(Map<String,Object> map) {
        map.put("name", "AAA");
        return "index";
    }
}
