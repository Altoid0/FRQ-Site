package com.application.frq;

import com.application.frq.Eyaad.Recursion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@RequestMapping("/eyaad")
@Controller
public class EyaadController {
        @GetMapping("")
        public String index(){
            return "Eyaad/index.html";
        }

        @GetMapping("/recursion")
        public String recursion(@RequestParam(value ="num", required = false) Integer num, @RequestParam(value = "decimal", required = false) Integer decimal, Model model) {
            Recursion recursion = new Recursion();
            if (num == null) {
                num = 1;
            }
            if (decimal == null) {
                decimal = 255;
            }
            model.addAttribute("numb", recursion.returnFact(num));
            model.addAttribute("bin", recursion.returnBinary(decimal));
            return "Eyaad/recursion.html";
        }

       /* @GetMapping("/fac")
        public String fact(@RequestParam(name="num", required = false, defaultValue = "1") int num, Model model) {
            Recursion recursion = new Recursion();
            model.addAttribute("numb", recursion.returnFact(num));
            return "Eyaad/recursion.html";
        }*/

}
