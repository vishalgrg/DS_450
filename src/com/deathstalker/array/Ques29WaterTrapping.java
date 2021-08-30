package com.deathstalker.array;

public class Ques29WaterTrapping {

//Given an array arr[] of N non-negative integers representing the height of blocks.
// If width of each block is 1,
// compute how much water can be trapped between the blocks during the rainy season.


    //Input:
    //N = 6
    //arr[] = {3,0,0,2,0,4}
    //Output:
    //10


    public static void main(String[] args) {
        System.out.print(trap(new int[]{3,0,0,2,0,4},6));
    }
    public static int trap(int[]height,int n){
        int result=0;
        int i = 0, j = height.length - 1;
        int left_max = 0, right_max = 0;

        while(i<=j)
        {
            if(height[i]<height[j])
            {
                if(height[i]>left_max) left_max=height[i];
                else result+=left_max-height[i];
                i++;
            }
            else
            {
                if(height[j]>right_max) right_max=height[j];
                else result+=right_max-height[j];
                j--;
            }
        }
        return result;
    }
}
