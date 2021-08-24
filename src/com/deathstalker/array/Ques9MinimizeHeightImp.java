package com.deathstalker.array;

import java.util.Arrays;

public class Ques9MinimizeHeightImp {

 /*   Given heights of n towers and a value k. We need to either increase or decrease
    the height of every tower by k (only once) where k > 0. The task is to minimize
    the difference between the heights of the
    longest and the shortest tower after modifications and output this difference.*/


   /* Input  : arr[] = {1, 15, 10}, k = 6
    Output :  Maximum difference is 5.
    Explanation : We change 1 to 7, 15 to
    9 and 10 to 4. Maximum difference is 5
    (between 4 and 9). We can't get a lower
    difference.


    Input : arr[] = {1, 5, 15, 10}
    k = 3
    Output : Maximum difference is 8
    arr[] = {4, 8, 12, 7}*/


    public static void main(String[] args) {
        System.out.print(getMinDiff(new int[]{4, 8, 12, 7},4,3));
    }

    // min value will increase by k
    // max value will decrease by k

    // min diff both them will be our ans.
    public static int getMinDiff(int[] arr, int n, int k) {
        if (arr == null || n<=0) return -1;
        Arrays.sort(arr);   // 4 7 8 12   k = 3 ==>  1,4 5 9  ==>  9 - 5 =4 ans

        int min = 0,max = 0,res = 0;
        res = arr[n-1] - arr[0];
        for (int i = 1;i<n;++i){
        if (arr[i]>=k){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min   =Math.min(arr[i]-k,arr[0]+k);

            res = Math.min(res,max-min);
        }else {
            continue;
        }
        }
        return res;
    }


}
