package org.algorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public void sortWithSelection(Integer[] array) {

        for (int i = 0; i < array.length -1 ; i++) {

            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx])
                    minIdx = j;
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        Arrays.stream(array).forEach(System.out::println);
    }

}
