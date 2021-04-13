package com.application.frq;


import com.application.frq.Dhruv.Insertion;
import com.application.frq.Dhruv.Recursion;
import com.application.frq.Dhruv.Inheritance.*;
import com.application.frq.Dhruv.Insertion.*;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RequestMapping("/dhruv")
@Controller
public class DhruvController {
    @GetMapping("")
    public String index() {
        return "Dhruv/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "sum", required = false) Integer sum,
                            @RequestParam(value = "bin", required = false) Integer bin, Model model) {

        Recursion r = new Recursion();
        // Logic for summation factorial
        Integer finsum;
        if (sum == null) {
            finsum = 0;
        }
        else {
            finsum = r.sum(sum);
        }

        // Logic for Decimal to Binary
        String finbin;
        if (bin == null) {
            finbin = "0";
        }
        else {
            finbin = r.toBinary(bin);
        }

        model.addAttribute("finsum", finsum);
        model.addAttribute("finbin", finbin);
        return "Dhruv/recursion.html";
    }

    @GetMapping("/inheritance")
    public String inheritance(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "age", required = false) Integer age, Model model) {

        if (name == null) {
            name = " ";
        }
        if (age == null) {
            age = 0;
        }
        //Create child class instance bird
        Bird bird = new Bird(name, age);


        //Create child class instance giraffe
        Giraffe giraffe = new Giraffe(name, age);

        model.addAttribute("birdtext", bird.returnabout());
        model.addAttribute("girtext", giraffe.returnabout());
        return "Dhruv/inheritance.html";
    }

    @GetMapping("/insertion")
    public String insertion(@RequestParam(value = "unsortarray", required = false) String unsort, Model model) {
        if (unsort == null) {
            unsort = " ";
        }
        String str = unsort;

        String[] items = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                //NOTE: write something here if you need to recover from formatting errors
            };
        }

        Insertion test = new Insertion();
        test.Insertion(results);


        model.addAttribute("unsort", str);
        model.addAttribute("sort", Arrays.toString(results));

        return "Dhruv/insertion.html";
    }



}
