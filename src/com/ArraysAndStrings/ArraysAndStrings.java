package com.ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javafx.util.Pair;

public class ArraysAndStrings {

    // ideas:
    // error check and edge case check
    // would want everything to be same case

    // iterate through each string
    // add each character to a map that has the char as the character and the frequency count as the value
    // have map for a single word and then use other word as a test checker, decreementing the value of the fre q
    // iterate trough  map and if u get all instances of zeroes then return true

    // runtime O(n)
    public static boolean isStringPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Illegal input string");
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        String updatedS1 = s1.toLowerCase();
        String updatedS2 = s2.toLowerCase();
        HashMap<Character, Integer> permutationChecker =  new HashMap<>();
        for (int i = 0; i < updatedS1.length(); i++) {
            //case where character is already in map and needs to be incremented
            if (permutationChecker.containsKey(updatedS1.charAt(i))) {
                int incrementedCharFrequency = permutationChecker.get(updatedS1.charAt(i)) + 1;
                permutationChecker.replace(updatedS1.charAt(i), incrementedCharFrequency);
            } else {

                // case where chracter is being seen for first time
                permutationChecker.put(updatedS1.charAt(i), 1);
            }
        }
        // using second string to test against string 1 -  at end of loop should have all zeroes if permutation
        for (int i = 0; i < updatedS2.length(); i++) {
            if (permutationChecker.containsKey(updatedS2.charAt(i)))  {
                int decrementedCharFrequency = permutationChecker.get(updatedS1.charAt(i)) - 1;
                permutationChecker.replace(updatedS1.charAt(i), decrementedCharFrequency);
            }
        }
        for (int i = 0; i < updatedS1.length(); i++) {
            if (permutationChecker.get(updatedS1.charAt(i)) != 0) {
                return false;
            }
        }
        return true;
    }


    public static ArrayList<Pair<Integer, Integer>> pairsThatEqualSum(int[] inputArray, int targetSum) {
        HashMap<Integer, Integer> values = new HashMap<>();
        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();

        Pair<Integer, Integer> newPair;

        for (int i = 0; i < inputArray.length; i++) {
            // case where hashmap does not already contain the missing part of the pair that adds to target sum
            if (!values.containsKey(targetSum - inputArray[i])) {
                values.put(inputArray[i], i);
            } else {
                // case where hashmap ALREADY contains the missing part of the pair that adds to target sum; create pair
                newPair = new Pair<>(inputArray[i], targetSum - inputArray[i]);
                pairs.add(newPair);
            }
        }
        return pairs;
    }
}
