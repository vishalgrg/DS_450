package com.deathstalker.array;

import java.util.Arrays;

public class Ques11MergeSorted {

    //Merge Without Extra Space
    /*Given two sorted arrays arr1[] of size N and arr2[] of size M.
    Each array is sorted in non-decreasing order. Merge the
    two arrays into one sorted array in non-decreasing order without using any extra space.

Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any
extra space, modify the given arrays
to form
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}


    */

    public static void main(String[] args) {
        merge(new int[]{1, 3, 5, 7},new int[] {0, 2, 6, 8, 9},4,5);
    }

    public  static  void merge(int arr1[], int arr2[], int n, int m) {

        int i = n-1;
        int j = 0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){

                int temp = arr2[j];
                arr2[j]=arr1[i];
                arr1[i]=temp;

            }

            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
