package com.skyisbule.jxwebsite.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyisbule on 2018/3/20.
 */
@Controller
public class FrontView {

    @RequestMapping("/")
    public String index(){return "index";}

    @RequestMapping("/showarticle")
    public String showArt(){return "show_article";}

}
