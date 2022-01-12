package com.example.hongpark.controller;

import com.example.hongpark.dto.ArticleForm;
import com.example.hongpark.repository.ArticleRepository;
import com.example.hongpark.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired                                              //스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;            //new 를 통해서 객체를 선언하지 않아도 되는 이유는 스프링부트가 알아서 해주기 떄문.

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form)
    {
        System.out.println(form.toString());

        //1.DTO를 변환 ! 엔티티로.
        Article article = form.toEntity();
        System.out.println(article.toString());

        ///2.Reposotory에 Entity를 DB안에 저장하게 한다.
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }






}
