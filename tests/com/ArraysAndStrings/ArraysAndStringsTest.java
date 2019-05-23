package com.ArraysAndStrings;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
}