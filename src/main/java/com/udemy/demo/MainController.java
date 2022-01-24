package com.udemy.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value={"/", "/addBook", "/listBooks", "/myBooks", "/myBorrows" })
    public String index() {
        return "index.html";
    }

}