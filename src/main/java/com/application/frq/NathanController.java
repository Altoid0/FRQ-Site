package com.application.frq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nathan")
@Controller
public class NathanController {

    @GetMapping("/")
    public String index(){
        return "Nathan/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(){
        return "Nathan/recursion.html";
    }

}
