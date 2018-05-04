package com.skyisbule.jxwebsite.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyisbule on 2018/5/4.
 */
@Controller
public class GroupController {

    @RequestMapping("/group")
    public String group(Model model){

        return "group";
    }

}
