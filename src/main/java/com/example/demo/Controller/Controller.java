package com.example.demo.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@AllArgsConstructor
public class Controller {
    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/demo")
    public String demo(){
        return "index2";
    }

}
