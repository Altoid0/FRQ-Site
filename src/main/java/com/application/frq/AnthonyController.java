package com.application.frq;

import com.application.frq.Anthony.Recursion;
import com.application.frq.Anthony.Insertion;
import com.application.frq.Anthony.Sorts;
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

    @GetMapping("/sorts")
    public String sorts(@RequestParam(value = "size", required = false) Integer size,
                            @RequestParam(value = "mode", required = false) Integer mode,
                            @RequestParam(value = "type", required = false) String type, Model model){
        String[] strings = {"Computer Science", "Linked List", "Mortensen", "Del Norte", "Sorting", "Algorithm", "Operating System", "Binary", "Hexadecimal", "Thymeleaf"};
        Sorts.Champion[] champions = {new Sorts.Champion("Gragas", 7), new Sorts.Champion("Ryze", 5),  new Sorts.Champion("Azir", 1), new Sorts.Champion("Qiyana", 6), new Sorts.Champion("Zed", 5), new Sorts.Champion("Nidalee", 6), new Sorts.Champion("Twisted Fate", 7), new Sorts.Champion("Warwick", 2), new Sorts.Champion("Nunu", 4), new Sorts.Champion("Evelynn", 3)};
        Sorts s = new Sorts();
        if (size == null)
            size = 5;
        if (mode == null)
            mode = 2;
        if (type == null)
            type = "Integer";

        String originalArray = "";
        String finalArray = "";
        long startTime, endTime=0;
        Comparable[] array = new Comparable[size];
        if(type.equals("Integer"))
            for (int i = 0; i < size; i++)
                array[i] = (int)(Math.random() * 10 + 1);

        if(type.equals("String"))
            for (int i = 0; i < size; i++)
                array[i] = strings[i];

        if(type.equals("Champion"))
            for (int i = 0; i < size; i++)
                array[i] = champions[i];

        originalArray = "{";
        for (int i = 0; i < array.length-1; i++) {
            originalArray += array[i] + ", ";
        }
        originalArray += array[array.length-1] + "}";

        Comparable[] sorted = new Comparable[size];
        if (mode == 1) {
            startTime = System.nanoTime();
            sorted = s.bubbleSort(array);
            endTime = System.nanoTime() - startTime;
        }
        if (mode == 2) {
            startTime = System.nanoTime();
            sorted = s.insertionSort(array);
            endTime = System.nanoTime() - startTime;
        }
        if (mode == 3) {
            startTime = System.nanoTime();
            sorted = s.selectionSort(array);
            endTime = System.nanoTime() - startTime;
        }
        finalArray = "{";
        for (int i = 0; i < sorted.length-1; i++) {
            finalArray += sorted[i] + ", ";
        }
        finalArray += sorted[sorted.length-1] + "}";

        model.addAttribute("original", "Original array: " + originalArray);
        model.addAttribute("final", "Final array: " + finalArray);
        model.addAttribute("time", "Time taken: " + endTime + " nanoseconds");

        return "Anthony/sorts.html";
    }

}
