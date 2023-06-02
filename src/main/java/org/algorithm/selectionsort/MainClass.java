package org.algorithm.selectionsort;

import java.util.Arrays;

public class MainClass {


    public static void main(String[] args) throws InterruptedException {

        Integer[] array  = {3,10,5,80,40,70,60,900,12,105,950,500};
        SelectionSort sort = new SelectionSort();

        sort.sortWithSelection(array);

        System.out.println(Arrays.toString(array));

    }
}
