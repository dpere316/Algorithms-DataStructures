package com.AlgoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonConstructibleChange {

    // "coins": [5, 7, 1, 1, 2, 3, 22] -> [1,1,2,3,5,7,22] -> index 1
    // "min" : 20
    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int createdCoin = 0;
        for(int coin : coins){
            if(coin > createdCoin +1){
                return createdCoin +1;
            }
            createdCoin += coin;
        }
        return createdCoin + 1;

    }

    public static void main(String[] args) {
        nonConstructibleChange(new int[]{6, 4, 5, 1, 1, 8, 9});
    }
}
