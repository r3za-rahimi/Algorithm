package org.algorithm.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 5, 9, 16, 27, 36, 54};

        int result = DataStructure.binarySearch(ints, 20);
        System.out.println(result);

        int result2 = DataStructure.binarySearchRecursive(ints, 5, ints.length - 1, 0);
        System.out.println(result2);
    }
}
