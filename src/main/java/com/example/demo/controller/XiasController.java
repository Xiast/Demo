package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class XiasController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/xiast")
    public String xiast(Map<String,Object> map){
        map.put("xiast","夏书童");
        return "xiast";

    }





}
