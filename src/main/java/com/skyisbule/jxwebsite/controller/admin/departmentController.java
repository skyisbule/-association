package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.DepartmentUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skyisbule.jxwebsite.domain.DepartmentUser;

/**
 * Created by skyisbule on 2018/3/20.
 * 部门管理
 */
@RestController
@RequestMapping("/api/bumen")
public class departmentController {

    @Autowired
    DepartmentUserMapper dao;

    //部门id  用户id  工作
    @RequestMapping("/add")
    public String addUserTodep(DepartmentUser user){
        dao.insert(user);
        return "1";
    }

}
