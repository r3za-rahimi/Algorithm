package org.algorithm.quicksort;

public class SumArray {


    public static int recursiveSum(Integer[] arr, Integer index) {

        if (index == 0) {

            return arr[0];
        }
        return arr[index] + recursiveSum(arr, --index);

    }
}
