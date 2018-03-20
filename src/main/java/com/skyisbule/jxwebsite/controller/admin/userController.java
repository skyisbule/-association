package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.UserMapper;
import com.skyisbule.jxwebsite.dao.bumenDao;
import com.skyisbule.jxwebsite.domain.User;
import com.skyisbule.jxwebsite.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by skyisbule on 2018/3/20.
 */
@RestController
@RequestMapping("/api/user")
public class userController {

    @Autowired
    UserMapper userDao;
    @Autowired
    bumenDao bumenDao;

    @RequestMapping("/get-all")
    @ResponseBody
    public List<User> getAlluser(){
        UserExample e = new UserExample();
        e.createCriteria();
        List<User> users= userDao.selectByExample(e);
        for (User user : users){
            user.setPasswd("***");
        }
        return users;
    }

    //连接了用户表和部门表
    @RequestMapping("/get-now-user")
    public Map<String,Object> getNow(@CookieValue("id")int id){
        return bumenDao.getUserAndhisBumen(id);
    }

}
