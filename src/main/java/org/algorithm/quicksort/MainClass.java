package org.algorithm.quicksort;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Integer[] arr = {50, 7, 2, 20, 4, 14, 13};
//       System.out.println(SumArray.recursiveSum(arr , arr.length -1));

        new QuickSort().sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
