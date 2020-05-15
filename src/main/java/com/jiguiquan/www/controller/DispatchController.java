package com.jiguiquan.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jigq
 * @create 2020-05-15 18:48
 */
@Controller
public class DispatchController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("index");
        return "index";
    }
}
