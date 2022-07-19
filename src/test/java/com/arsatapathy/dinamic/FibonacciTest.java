package com.arsatapathy.dinamic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class FibonacciTest {

    @Test
    public void test_01() {
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(2, fibonacci.fib(3));
        Assert.assertEquals(12586269025L, fibonacci.fib(50, new HashMap<>()));
    }
}
