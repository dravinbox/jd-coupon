package com.hot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Dravin
 * @Date 2018/11/9 下午4:02
 * @Version 1.0
 */
@Api(value = "TestController",tags = "测试")
@RestController
public class TestController {
    @ApiOperation("测试接口")
    @GetMapping("/test")
    public String test(){
        return "test success";

    }
}
