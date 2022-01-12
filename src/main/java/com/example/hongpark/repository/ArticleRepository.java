package com.example.hongpark.repository;

import com.example.hongpark.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {       //<관리대상, id의 타입값>

}
