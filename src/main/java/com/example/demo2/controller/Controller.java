package com.example.demo2.controller;

import com.example.demo2.dto.TestDto;
import com.example.demo2.service.TestService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private TestService testService;

    public Controller(TestService testService){
        this.testService = testService;
    }

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
        TestDto testDto = testService.getTest();
        model.addAttribute("test", testDto);
        return "index_info.html";
    }

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

}
