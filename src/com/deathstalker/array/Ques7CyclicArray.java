package com.deathstalker.array;

import java.util.Arrays;

public class Ques7CyclicArray {
    //Given an array, rotate the array by one position in clock-wise direction.
    /*Input:
    N = 5
    A[] = {1, 2, 3, 4, 5}
    Output:
            5 1 2 3 4


    Input:
    N = 8
    A[] = {9, 8, 7, 6, 4, 2, 1, 3}
    Output:
            3 9 8 7 6 4 2 1*/


    public static void main(String[] args) {
        System.out.print(Arrays.toString(doCyclicRotate1(new int[]{1, 2,3}, 3)));
    }

    // Approach 1
    public static int[] doCyclicRotate(int arr[], int n) {

        if (arr == null || n <= 0) return arr;
        if (n == 1) return arr;
        if (n == 2) {
            int last = arr[1];
            arr[1] = arr[0];
            arr[0] = last;

            return arr;
        }
        int lastElement = arr[n - 1], i;

        for (i = n - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        return arr;
    }

    // Approach -2
    public static int[] doCyclicRotate1(int arr[], int n) {

        if (arr == null || n <= 0) return arr;
        if (n == 1) return arr;
        if (n == 2) {
            int last = arr[1];
            arr[1] = arr[0];
            arr[0] = last;

            return arr;
        }

        int i = 0, j = n - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        return arr;
    }



}
