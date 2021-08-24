package com.deathstalker.array;

public class Ques8KadaneAlgorithm {

    //Kadane's Algorithm
   /* Given an array arr of N integers. Find the contiguous sub-array(containing at least one number)
    which has the maximum sum and return its sum.

    Input:
    N = 5
    arr[] = {1,2,3,-2,5}
    Output:
            9
    Explanation:
    Max subarray sum is 9
    of elements (1, 2, 3, -2, 5) which
    is a contiguous subarray.


    Input:
    N = 4
    arr[] = {-1,-2,-3,-4}
    Output:
            -1
    Explanation:
    Max subarray sum is -1
    of element (-1)
*/

    //{-2, -3, 4, -1, -2, 1, 5, -3}

    public static void main(String[] args) {
        System.out.print(maxSubarraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3},8));
    }
    public static int maxSubarraySum(int arr[], int n){

        if (null == arr || arr.length <=0) return -1;
        if (arr.length == 1) return arr[1];
        int maxSofar = Integer.MIN_VALUE, maxEnd = 0;
        for (int i = 0; i<n;++i){
            maxEnd = maxEnd+arr[i];
            if (maxSofar<maxEnd)
                maxSofar = maxEnd;

            if (maxEnd<0)
                maxEnd = 0;
        }
        return maxSofar;
    }



}
