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
    public String recursion(@RequestParam(value = "sum", required = false) Integer sum, Model model) {

        // Logic for summation factorial
        Integer finsum;
        if (sum == null) {
            finsum = 0;
        }
        else {
            finsum = com.application.frq.Dhruv.Recursion.sum(sum);
        }

        model.addAttribute("finsum", finsum);
        return "Dhruv/recursion.html";
    }

}
