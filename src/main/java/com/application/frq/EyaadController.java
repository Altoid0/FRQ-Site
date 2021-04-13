package com.application.frq;

import java.util.ArrayList;

import com.application.frq.Eyaad.InsertionSort;
import com.application.frq.Eyaad.Recursion;
import com.application.frq.Eyaad.Book;
import com.application.frq.Eyaad.PictureBook;
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
        public String recursion(@RequestParam(value ="num", required = false) Integer num, @RequestParam(value = "decimal", required = false) Integer decimal, @RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2, Model model) {
            long startTime = System.nanoTime();
            Recursion recursion = new Recursion();
            if (num == null) {
                num = 1;
            }
            if (decimal == null) {
                decimal = 255;
            }
            if (num1 == null) {
                num1 = 7;
            }
            if (num2 == null) {
                num2 = 3;
            }
            model.addAttribute("numb", recursion.returnFact(num));
            model.addAttribute("bin", recursion.returnBinary(decimal));
            model.addAttribute("greatest", recursion.returnGcf(num1, num2));
            long finalTime = System.nanoTime() - startTime;
            model.addAttribute("time", "Time it took: " + finalTime + " nanoseconds");
            return "Eyaad/recursion.html";
        }

        @GetMapping("/inheritance")
        public String inheritance(@RequestParam(value="title", required = false) String title, @RequestParam(value="author", required = false) String author, @RequestParam(value="illustrator", required = false) String illustrator, Model model) {
            long startTime = System.nanoTime();
            if (title == null || title == "") {
                title = "League of Legends Guide";
            }
            if (author == null || author == "") {
                author = "5 year Challenger Eyaad Mir";
            }
            if (illustrator == null || illustrator == "") {
                Book book = new Book(title, author);
                model.addAttribute("sentence", book);
                long finalTime = System.nanoTime() - startTime;
                model.addAttribute("time", "Time it took: " + finalTime + " nanoseconds");
                return "Eyaad/inheritance.html";
            }
            PictureBook picturebook = new PictureBook(title, author, illustrator);
            model.addAttribute("sentence", picturebook);
            long finalTime = System.nanoTime() - startTime;
            model.addAttribute("time", "Time it took: " + finalTime + " nanoseconds");
            return "Eyaad/inheritance.html";
        }

        @GetMapping("/insertion")
        public String insertion(@RequestParam(value="length", required = false, defaultValue = "8") int length, Model model) {
            long startTime = System.nanoTime();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i < length; i++) {
                array.add((int)(Math.random()*100+1));
            }
            model.addAttribute("unsorted", "This is the unsorted array randomly generated: " + array.toString());
            //Integer[] arr = (Integer[]) array.toArray();
            Integer[] arr = new Integer[length];
            for (int j = 0; j < length; j++) {
                arr[j] = array.get(j);
            }
            InsertionSort insertion = new InsertionSort();
            model.addAttribute("sorted", "This is the array after sorting: " + insertion.returnSort(arr));
            long finalTime = System.nanoTime() - startTime;
            model.addAttribute("time", "Time it took: " + finalTime + " nanoseconds");
            return "Eyaad/insertion.html";
        }

       /* @GetMapping("/fac")
        public String fact(@RequestParam(name="num", required = false, defaultValue = "1") int num, Model model) {
            Recursion recursion = new Recursion();
            model.addAttribute("numb", recursion.returnFact(num));
            return "Eyaad/recursion.html";
        }*/

}
