package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(applyOperationsToAnArray(nums1)));

        int[] nums2 = { 0, 1 };
        System.out.println(Arrays.toString(applyOperationsToAnArray(nums2)));

    }

    // This method applies operations to int[] nums as per challenge specifications
    // and returns the resulting array after they have been performed.
    public static int[] applyOperationsToAnArray(int[] nums) {

        // As per the challenge specifications, if nums[i] is equal to nums[i+1],
        // then we multiply nums[i] by 2 and set nums[i+1] to 0.
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }

        }

        // We create a new array that reorders the elements
        // of the original array as per challenge specifications.
        int[] newnums = new int[nums.length];
        int index = 0;

        // We move all non-0 elements to the left as per challenge specifications,
        // and leave all the 0-value elements to the right of every other value.
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                newnums[index] = nums[i];
                index++;
            }

        }

        // Finally, we return the resulting array.
        return newnums;

    }

}
