package com.arsatapathy.dinamic;

import java.util.Map;

public class Fibonacci {

    public long fib(int n) {
        if (n <= 2) return 1;

        return fib(n -1)  + fib(n - 2);
    }

    public long fib(int n, Map<Integer, Long> visited) {
        if (n <=2) return 1;

        if (visited.containsKey(n)) {
            return visited.get(n);
        }

        var fib = fib(n-1, visited) + fib(n-2, visited);

        visited.put(n, fib);

        return fib;
    }
}
