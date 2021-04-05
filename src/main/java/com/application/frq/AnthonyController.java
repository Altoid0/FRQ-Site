package com.application.frq;

import com.application.frq.Anthony.Recursion;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/anthony")
@Controller
public class AnthonyController {
    @GetMapping("")
    public String index(){
        return "Anthony/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "facInt") Integer facInt, 
                            @RequestParam(value = "frogInt") Integer frogInt, Model model){
        Recursion r = new Recursion();
        if (facInt == null) {
            facInt = 0;
        }
        if (frogInt == null) {
            frogInt = 2;
        }
        model.addAttribute("factorial", r.returnFac(facInt));
        model.addAttribute("frogs", r.returnFrog(frogInt));

        return "Anthony/recursion.html";
    }


}
