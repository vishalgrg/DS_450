package com.deathstalker.array;

import java.util.ArrayList;
import java.util.Collections;

public class Ques30ChoclateDistribute {

//Chocolate Distribution Problem

    //Given an array of n integers where each value
    // represents the number of chocolates in a packet. Each packet can have a variable number of chocolates.
    // There are m students, the task is to distribute chocolate packets such that:
    //-------------

    //Each student gets one packet:-

    //The difference between the number of chocolates
    // in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
    //Examples:

    //Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
    //Output: Minimum Difference is 2
    //Explanation:
    //We have seven packets of chocolates and
    //we need to pick three packets for 3 students
    //If we pick 2, 3 and 4, we get the minimum
    //difference between maximum and minimum packet sizes.


    //Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
    //Output: Minimum Difference is 6
    //Explanation:
    //The set goes like 3,4,7,9,9 and the output
    //is 9-3 = 6
    //
    //Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41,
    //30, 40, 28, 42, 30, 44, 48,
    //43, 50} , m = 7
    //Output: Minimum Difference is 10
    //Explanation:
    //We need to pick 7 packets. We pick 40, 41,
    //42, 44, 48, 43 and 50 to minimize difference
    //between maximum and minimum.



    // approach  : - ref GFG image ques 30
    //solution is based on the observation that to minimize the difference,
    // we must choose consecutive elements from a sorted packet. We first sort the array arr[0..n-1], t
    // hen find the subarray of size m with the minimum difference between the last and first elements.


    public static void main(String[] args) {
        //System.out.print(findMinDiff(new ArrayList<>()[]));
    }

    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        if(a == null) return 0;
        if(m>n) return 0;

        Collections.sort(a); //{1,2,4,7,9,9,12,56}


        long min = Long.MAX_VALUE;
        for (long i = 0; i+m-1<n ;i++){

            long diff =  a.get((int) ((i+m-1)))-a.get((int) i);

            if(diff<min){
                min = diff;
            }


        }
        return min;

    }
}
