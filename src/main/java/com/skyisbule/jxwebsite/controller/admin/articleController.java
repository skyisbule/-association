package com.skyisbule.jxwebsite.controller.admin;

import com.skyisbule.jxwebsite.dao.ArticleMapper;
import com.skyisbule.jxwebsite.domain.Article;
import com.skyisbule.jxwebsite.domain.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/get-article-by-uid")
    public List<Article> getArtByid(int uid){
        ArticleExample e = new ArticleExample();
        e.createCriteria()
                .andAuthorIdEqualTo(uid);
        return articleDao.selectByExample(e);
    }

}
