package com.AlgoExpert.Arrays;

import java.util.Arrays;
import java.util.List;

public class IsValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        // O(n) time || O(n) space;
        int index = 0;
        for(int num : array) {
            if(index == sequence.size())
            {
                break;
            }
            if(sequence.get(index).equals(num)){
                index++;
            }
        }
                return index == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList( 1, 6, -1, 10);

        isValidSubsequence(array,sequence);


    }
}
