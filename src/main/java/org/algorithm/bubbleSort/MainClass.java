package org.algorithm.bubbleSort;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        Integer[] array = {10,60,4,30,2,41,20,15,17,1} ;

        bubbleSort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
