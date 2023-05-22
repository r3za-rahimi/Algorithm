package org.algorithm.recursion;

public class MainClass {


    public static void main(String[] args) {


        /**
         *  Factorial
         *  */
        Factorial factorial = new Factorial();
        System.out.println(factorial.doFactorial(6));



        /**
         *  Fibonacci
         *  */
        Fibonacci fibonacci = new Fibonacci();
        int x  = 10;
        for (int i = 0; i < x  ; i++) {
            System.out.print(fibonacci.doFibonacci(i) +" / ");

        }

    }


}
