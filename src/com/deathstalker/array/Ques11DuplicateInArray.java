package com.deathstalker.array;

import java.util.Arrays;
import java.util.HashMap;

public class Ques11DuplicateInArray {

/*
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

    There is only one repeated number in nums, return this repeated number.

    You must solve the problem without modifying the array nums and uses only constant extra space.


    Input: nums = [1,3,4,2,2]
    Output: 2

    Input: nums = [1,1]
    Output: 1
    */


    public static void main(String[] args) {
        System.out.print(findDuplicate(new int[]{2,2,2}));
    }

    public static int findDuplicate(int[] nums) {

        int slow;
        int fast;
        slow = nums[0];
        fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;

    }

}
