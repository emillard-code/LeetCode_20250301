package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void applyOperationsToAnArrayTest() {

        int[] nums1 = { 1, 2, 2, 1, 1, 0 };
        int[] solu1 = { 1, 4, 2, 0, 0, 0 };
        assertArrayEquals(solu1, LeetCodeAttempt.applyOperationsToAnArray(nums1));

        int[] nums2 = { 0, 1 };
        int[] solu2 = { 1, 0 };
        assertArrayEquals(solu2, LeetCodeAttempt.applyOperationsToAnArray(nums2));

    }

}
