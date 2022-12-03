class Solution {
    public boolean isPalindrome(int x) {
        int reversedNumber = 0;
        int temp = x;
         if(x < 0 || (x % 10 == 0 && x !=0))
           return false;
        
        while(temp != 0) {
            reversedNumber = reversedNumber * 10 + temp % 10;
            temp /= 10;
        }
        
        if(x == reversedNumber)
            return true;
        return false;
    }
}