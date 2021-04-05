package com.application.frq;


import com.application.frq.Dhruv.Recursion;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/dhruv")
@Controller
public class DhruvController {
    @GetMapping("")
    public String index() {
        return "Dhruv/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "sum", required = false) int sum,
                            @RequestParam(value = "curr", required = false) int curr,
                            @RequestParam(value = "tail", required = false) int tail,
                            @RequestParam(value = "pow", required = false) int pow,
                            @RequestParam(value = "bin", required = false) int bin, Model model) {

        model.addAttribute("sum", Recursion.sum(sum));
        model.addAttribute("tail", Recursion.tail(curr, tail));
        model.addAttribute("pow", Recursion.power(pow));
        model.addAttribute("bin", Recursion.toBinary(bin));

        return "Dhruv/recursion.html";
    }

//    @GetMapping("/recursion")
//    public String recursion



}
