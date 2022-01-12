package com.example.hongpark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Article {

    @Id                         // 대표값을 지정한다.
    @GeneratedValue             // 1,2,3, 자동 어노테이션
    private Long id;

    @Column                     //칼럼 값이기 때문에 Colmn 어노테이션 추가
    private String title;

    @Column                     //칼럼 값이기 때문에 Colmn 어노테이션 추가
    private String content;


    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }



}
