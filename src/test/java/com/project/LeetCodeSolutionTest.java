package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void applyOperationsTest() {

        int[] nums1 = { 1, 2, 2, 1, 1, 0 };
        int[] solu1 = { 1, 4, 2, 0, 0, 0 };
        assertArrayEquals(solu1, LeetCodeSolution.applyOperations(nums1));

        int[] nums2 = { 0, 1 };
        int[] solu2 = { 1, 0 };
        assertArrayEquals(solu2, LeetCodeSolution.applyOperations(nums2));

    }

}
