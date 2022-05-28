package com.leetcode.Arrays.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1 );
            }
        }
        for(int i = 0; i < s.length();i++)
        {
            if(map.get(s.charAt(i)).equals(1))
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        new FirstUniqueCharacter().firstUniqChar("leetcode");
    }
}
