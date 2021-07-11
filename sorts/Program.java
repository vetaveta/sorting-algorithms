package com.sorts;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 1, -4, 0, 10, 60, 4, 22, 5};
        System.out.println(Arrays.toString(array));
        SortUtils.insertionSort(array);
        System.out.println(Arrays.toString(array));
        SortUtils.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
