import java.util.*;

public class ProductExceptSelf{
    public static void main(String[] args){
        int[] nums = {1,2,4,6};

        int[] result = new int[nums.length];

        int prefix =1;
        for(int i = 0 ;i< nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for(int i = nums.length -1;i>=0;i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}