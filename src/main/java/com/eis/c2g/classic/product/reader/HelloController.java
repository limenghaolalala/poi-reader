package com.eis.c2g.classic.product.reader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world!");
        return "HELLO WORLD!";
    }
}
