package org.algorithm.quicksort;

public class QuickSort {

    public void sort(Integer[] array){

        sort(array , 0 , array.length -1);
    }

    private void sort(Integer[] array , int start , int end) {

        if(start >= end){
            return;
        }
        int boundary = partition(array , start , end);

        sort(array , start , boundary-1 );
        sort(array , boundary+1 , end);

    }

    private int partition(Integer[] array , int start , int end) {

        int pivot = array[end];
        int boundary = start - 1 ;

        for (int i = start; i <= end; i++) {

            if (array[i] <= pivot) {
                swap(array, i, ++boundary);
            }
        }
        return boundary;
    }

    private void swap(Integer[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
