package org.algorithm.selectionsort;

public class MainClass {


    public static void main(String[] args) {

        Integer[] array  = {3,10,5,80,40,70,60,900,12,105,950,500};
        SelectionSort sort = new SelectionSort();
        
        sort.sortWithSelection(array);


    }
}
