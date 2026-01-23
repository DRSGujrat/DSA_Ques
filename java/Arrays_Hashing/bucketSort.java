// implement bucket sort from scratch ( not optimal for arrays with large input values like 1000,1000000 etc)


import java.util.*;

public class bucketSort {
    public static void main(String[] args){
        int[] nums = {5,1,1,4,3,1,0,0,2,4};
       
        int max = nums[0];
        int min = nums[0];
        for(int m : nums){
            if(m > max) max = m;
            if(m < min) min = m;
        }
        int size = max - min +1;
        int[] bucket = new int[size];
        int index= 0;
        for(int i = 0 ;i<nums.length ; i++){
            index = nums[i] - min;
            bucket[index]++;
        }

        int k = 0;
        
        for(int i = 0; i<bucket.length;i++){
            while(bucket[i] > 0){
                nums[k] = i + min;
                k++;
                bucket[i]--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}