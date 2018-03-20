package com.skyisbule.jxwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2018/3/18.
 * 视图控制器
 */
@Controller
public class view {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping("/admin")
    public String adminIndex(){
        return "admin_index";
    }

    @RequestMapping("/admin/main")
    public String adminMain(){
        return "admin_main";
    }

    @RequestMapping("/admin/editor")
    public String adminEditor(){
        return "editor";
    }

    @RequestMapping("/admin/datalist")
    public String adminDatalist(){
        return "admin_datalist";
    }

    @RequestMapping("/admin/user_manage")
    public String userManage(){return "admin_user_manage";}

    @RequestMapping("/admin/add_user")
    public String addUser(){return "admin_add_user";}

    @RequestMapping("/admin/set_user")
    public String setUsder(){return "admin_set_user";}
}
