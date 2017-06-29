package com.vincent.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by renwu on 2017/6/29.
 */
@Controller("/hello")
public class HelloController {

    @RequestMapping("/first")
    @ResponseBody
    public String hello(){
        return "asfsda";
    }
}
