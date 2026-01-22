// Given an integer array nums and an integer k, return the k most frequent elements within the array.

// The test cases are generated such that the answer is always unique.

// You may return the output in any order.

// Example 1:

// Input: nums = [1,2,2,3,3,3], k = 2

// Output: [2,3]
// Example 2:

// Input: nums = [7,7], k = 1

// Output: [7]


import java.util.*;


public class TopKFrequentElements{
    public static void main(String[] args){
        int[] nums = {1,2,1,4,2,4,2,1};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length +1];

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int i = 0 ; i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }


        int index = 0;
        int[] result = new int[k];
        for(int i = freq.length-1;i>=0 && index < k;i--){
            for(int n : freq[i]){
                result[index++] = n;
                if(index == k){
                    break;
                }
            }
            if(index == k) break;
        }
        
        System.out.println(Arrays.toString(result));
        

    }
}