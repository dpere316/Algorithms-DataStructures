package com.leetcode.Arrays.problems;

public class isPalindromeNumber {
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        char[] nums = num.toCharArray();
        for(int i = nums.length-1, j = 0; i >= 0; i--){
            if(nums[i] != num.charAt(j)){
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(-121);
    }
}
