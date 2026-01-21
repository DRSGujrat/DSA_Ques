// Contains Duplicate

// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Example 1:

// Input: nums = [1, 2, 3, 3]

// Output: true

// Example 2:

// Input: nums = [1, 2, 3, 4]

// Output: false

import java.util.*;


public class Contains_duplicate{
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        
        HashSet<Integer> H1 = new HashSet<>();

        for(int i = 0; i<arr.length;i++){
            H1.add(arr_duplicated[i]);
        }
        if(H1.size() == arr.length){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}