package org.algorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public void sortWithSelection(Integer[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minIdx = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIdx])
                    minIdx = j;
            }
            swap(array, i, minIdx);
        }

    }

    private void swap(Integer[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

}
