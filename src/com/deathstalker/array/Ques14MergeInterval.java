package com.deathstalker.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques14MergeInterval {


    //Given an array of intervals where intervals[i] = [starti, endi],
    // merge all overlapping intervals, and return an array of the non-overlapping intervals that cover
    // all the intervals in the input.

    //Example 1:
    //Input: intervals = [[1,3],[2,6],[8,10],[3,1]]
    //Output: [[1,6],[8,10]]
    //Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

    //Example 2:
    //Input: intervals = [[1,4],[4,5]]
    //Output: [[1,5]]
    //Explanation: Intervals [1,4] and [4,5] are considered overlapping.
    public static void main(String[] args) {
        // System.out.print(merge(new int[][]{}));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;

        Arrays.sort(intervals,(arr1, arr2)-> Integer.compare(arr1[0],arr2[0]));

        // sort the array of start point of array like
        // [1,3],[2,6],[3,1],[8,10]



        List<int[]> out = new ArrayList<>();


        int [] currInterval = intervals[0];
        // take copy of start array as curr array and add to result as out start point wud be s
        // ame as we have now sorted array
        out.add(currInterval);

        // will iterate the sorted array and will compare first interval of current
        // array element to last next interval of last element.
        // and if condition true will merge last element interval only.
        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0]<=currInterval[1]){
                currInterval[1] = Math.max(currInterval[1],intervals[i][1]);
            }else{
                currInterval = intervals[i];
                out.add(currInterval);
            }
        }
        return out.toArray(new int[out.size()][]);

    }
}
