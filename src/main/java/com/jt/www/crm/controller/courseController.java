package com.jt.www.crm.controller;


import com.jt.www.crm.model.Course;
import com.jt.www.crm.service.CourseService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@SpringBootApplication
class CourseController {
    @Resource
    private CourseService service;

    @RequestMapping("/AllCourse")
    @ResponseBody
    public JSONArray findAll(HttpServletRequest request) {
        List<Course> all = service.findAll();
        JSONArray ja = JSONArray.fromObject(all);
        return ja;
    }

    @GetMapping("/CourseIndex")
    public String index() {
        return "course/index";
    }

    @RequestMapping("/Test6")
    public String Test6() {
        return "Test6";
    }

    @RequestMapping("/Courseadd")
    public String Courseadd() {
        return "course/main";
    }

    @RequestMapping("/Coursefix")
    public String Coursefix() {
        return "course/fix";
    }

    @RequestMapping("/Coursedelete")
    public String Coursedelete() {
        return "Course/delete";
    }

    @RequestMapping("/Coursenew")
    public String Coursenew() {
        return "Course/new";
    }

}
