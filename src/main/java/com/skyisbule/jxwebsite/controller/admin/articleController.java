package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.ArticleMapper;
import com.skyisbule.jxwebsite.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by skyisbule on 2018/3/18.
 */
@RestController
@RequestMapping("/api/article")
public class articleController {

    @Autowired
    ArticleMapper articleDao;

    @RequestMapping("/add-article")
    public String add(Article article){
        Date time = new Date();

        article.setReleaseTime(time);
        articleDao.insert(article);
        return "success";
    }

}
