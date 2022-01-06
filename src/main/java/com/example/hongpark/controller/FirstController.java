package com.example.hongpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                                                                //Controller 어노테이션을 통해 선언해주어야 한다.
public class FirstController {
    @GetMapping("/greeting")                                               //GetMapping을 통해서 URL 연결
    public String niceToMeetYou(Model model) {                              //Model model 매개변수를 통해서 View 연결
        model.addAttribute("username", "컴공 이범기");    //받아온 model에 변수 username을 이범기로 초기화
        return "greetings";                                                //greetings을 return 하여 template 안에있는 greetings을 보여준다.
    }
}




