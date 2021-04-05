package com.application.frq.Tanay;

public class Recursion {
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}