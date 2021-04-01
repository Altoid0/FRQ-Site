package com.application.frq.Anthony;

public class Recursion {
    public static void main (String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial (int n) {
        return n>0 ? n*factorial(n-1) : 1;
    }

    public static String returnFac (int n) {
        int result = factorial(n);
        return "The factorial of " + n + " is " + result + ".";
    }

    public static int frogsProblem (int steps) { //problem finding the number of ways a frog can hop across a given number of steps if said frog can hop 1 or 2 steps
        if (steps == 1 || steps == 0) 
            return 1;
        return frogsProblem(steps-1) + frogsProblem(steps-2);
    }

    public static String returnFrog (int steps) {
        int result = factorial(steps);
        return "With " + steps + " number of steps, the frog has " + result + " paths that it can go on.";
    }
}