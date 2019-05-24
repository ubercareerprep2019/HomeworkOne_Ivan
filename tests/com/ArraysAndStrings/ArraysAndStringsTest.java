package com.ArraysAndStrings;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndStringsTest {

    @Test
    void isStringPermutationFalseCase() {
        String s1 = "bbbbbb";
        String s2 = "aaaaaa";
        assertFalse(ArraysAndStrings.isStringPermutation(s1, s2));
    }
    @Test
    void isStringPermutationIdenticalCase() {
        String s1 = "bbb";
        String s2 = "aaa";
        assertFalse(ArraysAndStrings.isStringPermutation(s1, s2));
    }
    @Test
    void isStringPermutationTrueCase() {
        String s1 = "ivanesmeral";
        String s2 = "esmeralivan";
        assertTrue(ArraysAndStrings.isStringPermutation(s1, s2));
    }

    @Test
    void isStringPermutationEdgeCase() {
        String s1 = "ivanESMERAL";
        String s2 = "esmeralIVAN";
        assertTrue(ArraysAndStrings.isStringPermutation(s1, s2));
    }

    @Test
    void pairsThatEqualSumEdgeCase() {
        int[] inputArray = {1, 2};
        int targetSum = 4;
        ArrayList<Pair<Integer, Integer>> pairs = ArraysAndStrings.pairsThatEqualSum(inputArray, targetSum);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i));
        }
        assertEquals(0, pairs.size());
    }

    @Test
    void pairsThatEqualSumStandardCase() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int targetSum = 7;
        ArrayList<Pair<Integer, Integer>> pairs = ArraysAndStrings.pairsThatEqualSum(inputArray, targetSum);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i));
        }
        assertEquals(2, pairs.size());
    }


    @Test
    void pairsThatEqualSumStandardSecondCase() {
        int[] inputArray = {1, 2, 1};
        int targetSum = 2;
        ArrayList<Pair<Integer, Integer>> pairs = ArraysAndStrings.pairsThatEqualSum(inputArray, targetSum);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i));
        }
        assertEquals(1, pairs.size());
    }


    @Test
    void pairsThatEqualSumZeroCase() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int targetSum = 0;
        ArrayList<Pair<Integer, Integer>> pairs = ArraysAndStrings.pairsThatEqualSum(inputArray, targetSum);
        assertEquals(0, pairs.size());
    }
}