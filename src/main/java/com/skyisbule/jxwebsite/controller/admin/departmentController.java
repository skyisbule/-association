package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.DepartmentUserMapper;
import com.skyisbule.jxwebsite.domain.DepartmentUserExample;
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
    @RequestMapping("/add-user-to-bumen")
    public String addUserTodep(DepartmentUser user){
        return dao.insert(user)==1?"success":"error";
    }

    @RequestMapping("/update-user-to-bumen")
    public String update(DepartmentUser user){
        DepartmentUserExample e = new DepartmentUserExample();
        e.createCriteria()
                .andUserIdEqualTo(user.getUserId());
        return dao.updateByExample(user,e)==1?"success":"error";
    }

}
