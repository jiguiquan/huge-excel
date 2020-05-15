package com.jiguiquan.www.controller;

import com.jiguiquan.www.common.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jigq
 * @create 2020-05-15 17:06
 */
@RestController
public class TestController {

    @GetMapping("/get/test")
    public CommonResult test(){
        return new CommonResult(200, "测试成功");
    }
}
