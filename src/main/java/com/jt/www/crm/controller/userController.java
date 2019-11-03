package com.jt.www.crm.controller;


import com.jt.www.crm.model.User;
import com.jt.www.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@SpringBootApplication
public class userController {

    @Resource
    private UserService userService;
    @Resource
    HttpServletRequest request;

    @RequestMapping("/login")
    public String goLogin() {
        return "user/login";
    }


    @RequestMapping("register")
    public String goRegistr() {
        return "user/register";
    }

    @RequestMapping("/registermgr")
    @ResponseBody
    public String registermgr(User user) {
        User testu = userService.findByUserId(user.getUserId()).get(0);
        if (null != testu) {
            return "error";
        } else {
            userService.save(user);
            return "sucess";
        }
    }

    @RequestMapping("/loginmgr")
    @ResponseBody
    public String loginmgr(User user) {
        User testu = userService.findByUserId(user.getUserId()).get(0);
        if (null != testu) {
            if (testu.getRole().equals(user.getRole())
                    && testu.getUserId().equals(user.getUserId())
                    && testu.getPassword().equals(user.getPassword())
            ) {
                request.getSession().setAttribute("user", user);
                return "sucess";
            } else {
                return "error";
            }
        } else {
            return "error";
        }
    }

}


