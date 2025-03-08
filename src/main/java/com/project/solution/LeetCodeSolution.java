package com.project.solution;

import java.util.Arrays;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(applyOperations(nums1)));

        int[] nums2 = { 0, 1 };
        System.out.println(Arrays.toString(applyOperations(nums2)));

    }

    public static int[] applyOperations(int[] nums) {

        int n = nums.length;
        int[] modifiedNums = new int[n];
        int zeroCount = 0;

        // Step 1: Apply operations on the array
        for (int index = 0; index < n - 1; index++) {

            if (nums[index] == nums[index + 1] && nums[index] != 0) {
                nums[index] *= 2;
                nums[index + 1] = 0;
            }

        }

        // Step 2: Move non-zero elements to the front
        for (int num : nums) {

            if (num != 0) {
                modifiedNums[zeroCount++] = num;
            }

        }

        // Step 3: Append zeros to maintain the original size
        while (zeroCount < n) {
            modifiedNums[zeroCount++] = 0;
        }

        return modifiedNums;

    }

}
