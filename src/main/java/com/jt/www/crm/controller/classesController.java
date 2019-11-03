package com.jt.www.crm.controller;

import com.jt.www.crm.model.Classes;
import com.jt.www.crm.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@SpringBootApplication

public class classesController {
    @Resource
    private ClassesService classesService;


    @GetMapping("/addclasses")
    public String goaddclasess() {
        return "class/addclasses";
    }


    /**
     * 书写人：冯敏东
     * 实现了跳转到首页
     * @return
     */
    @GetMapping("/index")
    public String goindex() {
        return "class/index";
    }



    @RequestMapping(value = "/classesindex", method = RequestMethod.GET)
    public String classindex() {
        return "class/index";
    }

    @PostMapping("/addclasses")
    @ResponseBody
    public String addclasses(Classes classes) {

        try {
            Classes testu = classesService.findById(classes.getClassId());
            if (null != testu) {
                return "error";
            } else {
                classesService.saveClasses(testu);
                return "sucess";
            }
        }catch (Exception e){
            return "error";
        }
    }


}
