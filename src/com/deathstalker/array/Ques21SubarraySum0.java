package com.deathstalker.array;

import java.util.HashSet;
import java.util.Set;

public class Ques21SubarraySum0 {


    //Given an array of positive and negative numbers.
    // Find if there is a subarray (of size at-least one) with 0 sum.

    //Example 1:
    //Input:
    //n=5
    //arr = 4 2 -3 1 6

    //Output: Yes

    //Explanation:
    //2, -3, 1 is the subarray
    //with sum 0.


    //Example 2:

    //Input:
    //5
    //4 2 0 1 6

    //Output:
    //Yes

    //Explanation:
    //0 is one of the element
    //in the array so there exist a
    //subarray with sum 0.


    public static void main(String[] args) {
        System.out.print(findsum(new int[]{4 ,2, 0 ,1 ,6},5));
    }
    static boolean findsum(int arr[],int n)
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
