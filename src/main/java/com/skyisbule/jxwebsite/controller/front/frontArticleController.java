package com.skyisbule.jxwebsite.controller.front;

import com.skyisbule.jxwebsite.dao.ArticleMapper;
import com.skyisbule.jxwebsite.domain.Article;
import com.skyisbule.jxwebsite.domain.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by skyisbule on 2018/3/20.
 */
@RestController
@RequestMapping("/front/article")
public class frontArticleController {

    @Autowired
    ArticleMapper dao;

    @RequestMapping("/getNews")
    public List<Article> getNews(int limit){
        ArticleExample e = new ArticleExample();
        e.setOffset(0);
        e.setLimit(5);
        e.createCriteria()
                .andArticleTypeEqualTo("0");
        return dao.selectByExample(e);
    }

    @RequestMapping("/getNewsById")
    public Article getById(int id){
        return dao.selectByPrimaryKey(id);
    }


}
