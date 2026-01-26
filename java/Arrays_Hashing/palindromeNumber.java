import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
    int y = x;
        if(y < 0) return false;
        int rev = 0;  
    while(y > 0){
        rev = rev*10 + y%10;
        y = y/10;
    }

    System.out.println(rev);

     return y == rev; 

    }
}