package org.algorithm.recursion;

public class Fibonacci {

    public int doFibonacci(int x) {

        if (x == 0 || x == 1) {

            return x;
        } else {

            return doFibonacci(x - 1) + doFibonacci(x - 2);

        }
    }
}
