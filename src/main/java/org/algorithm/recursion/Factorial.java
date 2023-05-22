package org.algorithm.recursion;

public class Factorial {

    public int doFactorial(int x){
        if (x==1){
            return 1;
        }
        return x * doFactorial(x-1);

    }
}
