package com.example.centostest;

import com.example.centostest.article.ArticleService.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String showMain() {
        return "<h1>Hello, SB</h1>";
    }
}
