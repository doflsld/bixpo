package com.example.demo2.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@CrossOrigin(origins = "*")
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
    public String info(){
        return "index_info.html";
    }

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

}
