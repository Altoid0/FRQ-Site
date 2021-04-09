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
import java.util.Random;

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
    public String insertion(@RequestParam(value = "length", required = false) Integer length,
                            @RequestParam(value = "randomCeil", required = false) Integer randomCeil, Model model){

        int l = (length == null || length<10 || length>40)?15:length.intValue();
        int rc = (randomCeil == null || randomCeil<20 || randomCeil>100)?20:randomCeil.intValue();

        Random rand = new Random();
        int[] arr = new int[l];
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(rc)+1;
        }
        int[][] steps = Insertion.insertionSortWithSteps(arr);

        model.addAttribute("steps", steps);
        model.addAttribute("length", l);
        model.addAttribute("randomCeil", rc);

        return "Nathan/insertion.html";
    }


}
