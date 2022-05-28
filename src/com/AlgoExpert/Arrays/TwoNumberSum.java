package com.AlgoExpert.Arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {

        // O(n^2) time || O(1) space
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if(array[i] + array[j] == targetSum)
                {
                    return new int[] {array[i],array[j]};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[]array, int targetSum){
        // O(n) time || O(n) space
        Set<Integer> nums = new HashSet<>();
        for(int num : array){
            int potentialMatch = targetSum - num;
            if(nums.contains(potentialMatch)){
                return new int[]{potentialMatch,num};
            }else{
                nums.add(num);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10);
        twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10);

    }
}
