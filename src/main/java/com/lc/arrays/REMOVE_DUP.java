package com.lc.arrays;

import java.io.Serializable;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 * Clarification:
 *
 * Confused why the returned value is an integer but your answer is an array?
 *
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 *
 * Internally you can think of this:
 *
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 *
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
public class REMOVE_DUP implements Serializable {
	public int getLengthWithDuplicatesRemoved(int[] nums){
		int len = nums.length;
        for(int i=0; i <nums.length;i++){

        }
		return len;
	}


    public static int gcd(int a,int b){
        System.out.println(a +"--"+b);
        return b > 0 ? gcd(b, a % b) : a;
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] =1;
        nums[2] =1;
        nums[3] =1;
        nums[4] =3;
        nums[5] =4;
        nums[6] =5;
        nums[7] =5;
        nums[8] =6;
        nums[9] =6;

        System.out.println(15 % 25);
        System.out.println(gcd(15,25));

    }

}