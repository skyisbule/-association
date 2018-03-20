package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.UserMapper;
import com.skyisbule.jxwebsite.domain.User;
import com.skyisbule.jxwebsite.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by skyisbule on 2018/3/20.
 */
@RestController
@RequestMapping("/api/user")
public class userController {

    @Autowired
    UserMapper userDao;

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


}
