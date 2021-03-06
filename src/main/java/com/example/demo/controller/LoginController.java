package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/index")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

        if(StringUtils.hasLength(username) && "123456".equals(password)){

            session.setAttribute("loginUser",username);

            //登陆成功，防止表单重复提交，可以重定向到主页
            return "redirect:/main";

        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return  "index";

        }




    }
}
