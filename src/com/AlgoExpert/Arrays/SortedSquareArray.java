package com.AlgoExpert.Arrays;

import java.util.Arrays;

public class SortedSquareArray {
    /*
        array = [1,2,3,5,6,8,9]
        for num in nums
        num = num * num;
        ans = [1,4,9,25,36,64,81]
    * */
    public static int[] sortedSquareArray(int[] array) {
        // O(n Log n) time || O(n)
        int[]ans = new int[array.length];
        for(int i =0; i < array.length; i++) {
            ans[i] = array[i] * array[i];
        }
        Arrays.sort(ans, 0, ans.length);
        return ans;
    }

    public static void main(String[] args) {
        sortedSquareArray(new int[]{1,2,3,5,6,8,9});
    }
}
