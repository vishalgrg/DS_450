package com.deathstalker.array;

public class Ques10MinJump {

   /* Given an array of N integers arr[] where each element represents
    the max number of steps that can be made forward from that element.
    Find the minimum number of jumps to reach the end of the array
    (starting from the first element). If an element is 0, then you cannot move through that element.

    Note: Return -1 if you can't reach the end of the array.



Input:
N = 11
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3
Explanation:
First jump from 1st element to 2nd
element with value 3. Now, from here
we jump to 5th element with value 9,
and from here we will jump to last.

{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}

halt = 0 ->1->  4-> 7->  11

i + arr[i] halt
0 +  1 =   1       max =0,1 thn update max = 1
1 +  3 =   4       max = 1,4 thn update max = 4
2 +  5  =  7
3 +  8 =   11
4 +  9  =  13

max = 0 -> 1 -> 4 -> 7 -> 11

*/

    public static void main(String[] args) {
        System.out.print(minJump(new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    }
    public static int minJump(int arr[]){
        int max = 0,jump=0,halt=0;

        // base case if arr[0] itself is 0 thn there is no way to reach last position
        if(arr[0]==0)return -1;

        //loop it for check every index
        for (int i = 0;i<arr.length-1;++i){
            max = Math.max(max,i+arr[i]);
            // if max itself is larger than array's last element than we have reached .
            if (max>=arr.length-1){
                jump++;
                return jump;
            }

            if (i==halt){
                halt=max;
                jump++;
            }
        }

        // if halt is reached to last element of array
        if (halt>=arr.length-1){
            return jump;
        }

        return -1;

    }

}
