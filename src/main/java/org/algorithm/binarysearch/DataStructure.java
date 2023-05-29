package org.algorithm.binarysearch;

public class DataStructure {


    public static int binarySearch(int[] ints, int input) {

        int lastIndex = ints.length - 1;
        int firstIndex = 0;
        while (lastIndex >= firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;

            if (ints[middleIndex] == input) {
                return middleIndex;

            }
            if (ints[middleIndex] < input) {
                firstIndex = middleIndex + 1;
            } else
                lastIndex = middleIndex - 1;

        }
        return -1;

    }

    public static int binarySearchRecursive(int[] ints, int input, int  lastIndex , int firstIndex ) {

        if (lastIndex >= firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;

            if (ints[middleIndex] == input)
                return middleIndex;


            if (ints[middleIndex] < input)
                return binarySearchRecursive(ints, input, lastIndex , middleIndex+1);

            if (ints[middleIndex] > input)
            return binarySearchRecursive(ints, input, middleIndex - 1, firstIndex);
        }
        return -1;
      }
    }


