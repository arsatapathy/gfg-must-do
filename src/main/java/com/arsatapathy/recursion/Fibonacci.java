package com.arsatapathy.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13
    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));

        System.out.println(fib(50, new HashMap<>()));
    }

    public static long fib(int n, Map<Integer, Long> memo) {
        if (n == 1 || n == 2) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        var fib = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, fib);

        return fib;
    }
}
