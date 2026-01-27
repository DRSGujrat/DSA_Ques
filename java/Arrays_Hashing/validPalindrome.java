class Solution {
    public boolean isPalindrome(String s) {
        char[] st = s.toCharArray();
        int left = 0;
        int right = st.length - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(st[left])){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(st[right])){
                right--;
            }
            if(Character.toLowerCase(st[left]) == Character.toLowerCase(st[right])){
                left++;
                right--;
            }
            else{
                return false;
            }

            
        }
        return true;
    }
}