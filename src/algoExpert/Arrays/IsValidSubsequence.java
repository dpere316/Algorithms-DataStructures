package algoExpert.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IsValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < array.size();i++)
        {
            if(count == sequence.size())
            {
                break;
            }
            if(array.get(i) == sequence.get(i)){
                count++;
            }
        }
        return count == sequence.size();

    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList( 1, 6, -1, 10);

        isValidSubsequence(array,sequence);


    }
}
