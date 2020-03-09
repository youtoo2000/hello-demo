package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(value="aaaaaaa",description="User的相关信息接口")
public class HelloController {

	@ApiOperation(value = "你好")
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@ApiParam(name="name",value="对话人",required=true)String name){
        return name+", hello";
    }


}
