package com.skyisbule.jxwebsite.controller.admin;

import cn.hutool.core.util.HashUtil;
import com.skyisbule.jxwebsite.dao.UserMapper;
import com.skyisbule.jxwebsite.domain.User;
import com.skyisbule.jxwebsite.domain.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by skyisbule on 2018/3/18.
 */
@RestController
public class LoginController {

    @Autowired
    UserMapper userDao;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@Param("user")  String user,
                        @Param("passwd")String passwd,
                        HttpServletResponse response){
        UserExample e = new UserExample();
        e.createCriteria()
                .andNickNameEqualTo("user");
        List<User> users = userDao.selectByExample(e);
        //没有该用户
        if (user.length()==0)
            return "noThisUser";
        //核对一下密码
        if (users.get(0).getPasswd().equals(passwd)){
            Cookie idCookie = new Cookie("id",users.get(0).getId().toString());
            Cookie passwdCookie = new Cookie("session",getHash(users.get(0).getPasswd()));
            response.addCookie(idCookie);
            response.addCookie(passwdCookie);
            return "success";

        }
            return "wrongPassword";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user){
        if (userDao.insert(user)==1){
            return "success";
        }else{
            return "false";
        }
    }

    private String getHash(String str){
        if (str != null && str.length() != 0){
            int hashCode = HashUtil.apHash(str);
            return String.valueOf(hashCode);
        }
        return "null";
    }

}
