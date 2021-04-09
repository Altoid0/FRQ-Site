package com.application.frq;

import com.application.frq.Tanay.Recursion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/tanay")
@Controller
public class TanayController {

    @GetMapping("")
    public String index(){
        return "Tanay/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "number", required = false) Integer number, Model model){

        Integer factorial;
        if (number == null) {
            factorial = 0;
        }
        else {
            factorial = Recursion.factorial(number);
        }
        model.addAttribute("factorial", factorial);
        return "Tanay/recursion.html";
    }
}
