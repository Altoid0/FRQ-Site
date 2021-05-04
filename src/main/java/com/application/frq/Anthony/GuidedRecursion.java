package com.application.frq.Anthony;

import java.util.ArrayList;

public class GuidedRecursion {
    public ArrayList<String> log = new ArrayList<String>();

    public int fib (int n) {
        if (n < 0) {
            log.add("Negative number received, operation ended");
            return -1;
        }
        log.add("Using switch case to determine what operation to do");
        switch (n) {
            case 0:
                log.add("Edge case of 0, return 0");
                return 0;
            case 1:
                log.add("Case of 1, add 0 to the final result");
                return 0;
            case 2:
                log.add("Case of 2, add 1 to the final result");
                return 1;
            default:
                log.add("Value higher than 2 given: adding the last two terms," + (n-2) + "th term of " + fib(n-2) + " and "  + (n-1) + "th term of " + fib(n-1) + " together");
                return fib(n-1) + fib(n-2);
        }
    }

    public String dumpLog () {
        String s = "";
        for (int i = 0; i < log.size(); i++) {
            s += log.get(i);
            s += "<br />";
        }
        return s;
    }
}
