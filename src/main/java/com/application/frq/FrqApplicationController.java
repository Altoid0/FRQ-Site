package com.application.frq;

import org.springframework.web.bind.annotation.GetMapping;

public class FrqApplicationController {
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/units")
    public String units(){
        return "units.html";
    }
}
