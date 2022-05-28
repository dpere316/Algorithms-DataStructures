package com.leetcode.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0, j = nums.length-1; i < nums.length;i++)
        {
            if(nums[i] == nums[j])
            {
                return true;
            }
            else{
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        new ContainsDuplicate().containsDuplicate(nums);
    }
}
