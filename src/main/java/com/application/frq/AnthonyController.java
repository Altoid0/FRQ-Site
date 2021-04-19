package com.application.frq;

import com.application.frq.Anthony.Recursion;
import com.application.frq.Anthony.Insertion;
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
    public String recursion(@RequestParam(value = "facInt", required = false) Integer facInt,
                            @RequestParam(value = "frogInt", required = false) Integer frogInt, Model model){
        Recursion r = new Recursion();
        if (facInt == null) {
            facInt = 0;
        }
        if (frogInt == null) {
            frogInt = 2;
        }
        long startFacTime = System.nanoTime();
        model.addAttribute("factorial", r.returnFac(facInt));
        long finalFacTime = System.nanoTime() - startFacTime;
        model.addAttribute("facTime", "Time taken: " + finalFacTime + " nanoseconds");

        long startFrogTime = System.nanoTime();
        model.addAttribute("frogs", r.returnFrog(frogInt));
        long finalFrogTime = System.nanoTime() - startFrogTime;
        model.addAttribute("frogTime", "Time taken: " + finalFrogTime + " nanoseconds");


        return "Anthony/recursion.html";
    }

    @GetMapping("/insertion")
    public String insertion(@RequestParam(value = "min", required = false) Integer min,
                            @RequestParam(value = "max", required = false) Integer max,
                            @RequestParam(value = "size", required = false) Integer size, Model model){
        Insertion i = new Insertion();
        if (min == null)
            min = 0;
        if (max == null)
            max = 10;
        if (size == null)
            size = 5;
        long startTime = System.nanoTime();
        model.addAttribute("insertion", i.insertionSort(min, max, size));
        long finalTime = System.nanoTime() - startTime;
        model.addAttribute("time", "Time taken: " + finalTime + " nanoseconds");

        return "Anthony/insertion.html";
    }

}
