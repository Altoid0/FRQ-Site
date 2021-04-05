package com.application.frq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tanay")
@Controller
public class TanayController {

    @GetMapping("/")
    public String index(){
        return "Tanay/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(){
        return "Tanay/recursion.html";
    }
}
