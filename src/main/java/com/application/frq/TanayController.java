package com.application.frq;

import com.application.frq.Tanay.Car;
import com.application.frq.Tanay.Recursion;
import com.application.frq.Tanay.SportsCar;
import com.application.frq.Tanay.Truck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.LinkedList;

@RequestMapping("/tanay")
@Controller
public class TanayController {

    //ArrayList<Car> Cars = new ArrayList<>();

    @GetMapping("")
    public String index(){
        return "Tanay/index.html";
    }

    @GetMapping("/recursion")
    public String recursion(@RequestParam(value = "number", required = false, defaultValue = "10") Integer number, Model model){

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

    @GetMapping("/inheritance")
    public String recursion(@RequestParam(value = "make", required = false, defaultValue = "Mazda") String make,
                            @RequestParam(value = "model", required = false, defaultValue = "Miata") String model,
                            @RequestParam(value = "age", required = false, defaultValue = "2006") Integer age,
                            @RequestParam(value = "topspeed", required = false, defaultValue = "135") Integer topspeed, Model springmodel){

        SportsCar sportscar1 = new SportsCar(make, model, age, topspeed);
        //Cars.add(sportscar1);

        springmodel.addAttribute("cars", sportscar1);
        return "Tanay/inheritance.html";
    }

    @GetMapping("/linkedlist")
    public String LinkedExample(@RequestParam(value = "unsortedlist", required = false) String unsortedlist, Model model ) {
        if (unsortedlist == null) {
            unsortedlist = " ";
        }
        String parsedlist = unsortedlist;
        String[] items = parsedlist.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        LinkedList<Integer> mylist = new LinkedList<Integer>();
        for(int i = 0; i < items.length; i++) {
            mylist.add(Integer.parseInt(items[i]));
        }
        LinkedList<Integer> mylistremovehead = mylist;
        mylistremovehead.remove();

        LinkedList<Integer> mylistremovemid = mylist;
        int mid = mylistremovemid.size()/2;
        mylistremovemid.remove(mid);

        LinkedList<Integer> mylistremovetail = mylist;
        int tail = mylistremovetail.size() - 1;
        mylistremovetail.remove(tail);

        LinkedList<Integer> mylistinserthead = mylist;
        mylistinserthead.add(0,97);

        LinkedList<Integer> mylistinsertlast = mylist;
        mylistinsertlast.add(97);
        // make sure this adds to the end

        model.addAttribute("removehead", mylistremovehead);
        model.addAttribute("removemid", mylistremovemid);
        model.addAttribute("removetail", mylistremovetail);

        return "Tanay/linkedlist.html";
    }
}
