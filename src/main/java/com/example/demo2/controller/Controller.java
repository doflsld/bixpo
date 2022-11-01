package com.example.demo2.controller;

import com.example.demo2.dto.TestgDto;
import com.example.demo2.dto.TestsDto;
import com.example.demo2.service.TestgService;
import com.example.demo2.service.TestsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    private TestsService testsService;
    private TestgService testgService;

    public Controller(TestsService testsService, TestgService testgService){
        this.testsService = testsService;
        this.testgService = testgService;
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
        TestsDto testsDto = testsService.getTests();
        model.addAttribute("tests", testsDto);
        TestgDto testgDto = testgService.getTestg();
        model.addAttribute("testg", testgDto);
        return "index_info";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
