package com.application.frq.Dhruv;

public class Recursion {
    public static void main(String[] args) {
        // Test case for intro
        System.out.println(sum(3));
        // Test case for tail recursion
        System.out.println(tail(3, 8));
        //Test case for Nth power recursion
        System.out.println(power(9));
        //Test case for Decimal to Binary conversion
        System.out.println(toBinary(23466));

    }

    // introductory recursion practice
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    //tail recursion practice
    public static int tail(int current, int n) {
        if (n <= 1) {
            return current + n;
        }
        return tail(current +n, n -1);
    }

    // Finding the N-th power of 10 practice
    public static int power(int n) {
        if (n == 0) {
            return 1;
        }
        return power(n - 1) * 10;
    }

    //Decimal to Binary
    public static String toBinary(int n) {
        if (n <= 1) {
            return String.valueOf(n);
        }
        return toBinary(n/2) + String.valueOf(n % 2);
    }
}
