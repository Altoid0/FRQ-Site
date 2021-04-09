package com.application.frq;

import com.application.frq.Nathan.Insertion;
import com.application.frq.Nathan.Recursion;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/nathan")
@Controller
public class NathanController {

    @GetMapping("")
    public String index(){
        return "Nathan/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "length", required = false) Integer length,
                            @RequestParam(value = "iterations", required = false) Integer iterations, Model model){

        int l = (length == null || length<1 || length>100)?10:length.intValue();
        String[] exampleData = Recursion.getExampleSort(l);


        List<Long> iterationData = null;
        if(iterations != null){
            int i = iterations.intValue();
            i = Math.min(i, 10000);
            i = Math.max(i, 10);

            iterationData = Recursion.sortMany(i);
        }else{
            iterations = 100;
        }

        model.addAttribute("iterations", iterations);
        model.addAttribute("iterationData", iterationData);
        model.addAttribute("length", l);
        model.addAttribute("unsorted", exampleData[0]);
        model.addAttribute("sorted", exampleData[1]);
        return "Nathan/recursion.html";
    }

    @GetMapping("/insertion")
    public String insertion(Model model){

        int[] vals = new int[]{5,2,8,9,23,1};
        int[][] steps = Insertion.insertionSortWithSteps(vals);
        model.addAttribute("steps", steps);
        return "Nathan/insertion.html";
    }


}
