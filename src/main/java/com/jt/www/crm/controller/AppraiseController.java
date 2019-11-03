package com.jt.www.crm.controller;

import com.jt.www.crm.dao.AppraiseDao;
import com.jt.www.crm.model.Appraise;

import com.jt.www.crm.model.Classes;
import com.jt.www.crm.service.AppraiseService;

import com.jt.www.crm.service.ClassesService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Action;
import java.util.List;


@Controller
@SpringBootApplication
public class AppraiseController {
@Resource
    public AppraiseService Service;
@Resource
private ClassesService classesService;



    @GetMapping("/Appraiseindex")
    public String index(){ return ("Appraise/index"); }


    @GetMapping("/Appraiseaddclasses")
    public String goaddclasess() {
        return "Appraise/addclasses";
    }

    @RequestMapping("/Classesid")
    public JSONArray findById(HttpServletRequest request) {
        Classes c=classesService.findById("2");
        JSONArray ja = JSONArray.fromObject(c);
        return ja;
    }

    @PostMapping(value = "/list")
    public  Object list() {

    }
}
