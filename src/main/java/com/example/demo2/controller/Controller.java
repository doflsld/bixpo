package com.example.demo2.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/monitor")
    public String test(){
        return "monitor";
    }

    @GetMapping("/main")
    public String main(){
        return "index";
    }

    @GetMapping("/info")
    public String info(Model model){
        return "index_info.html";
    }

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

}
