class Solution {
    public boolean halvesAreAlike(String s) {
        int lengthOfString = s.length() / 2;
        int count = 0;
        
        for(int i = 0; i < lengthOfString; i++) {
            if(isVowel(s.charAt(i)))
                count++;
        }
        
        for(int i = lengthOfString; i < s.length(); i++) {
            if(isVowel(s.charAt(i)))
                count--;
        }
        
        if (count == 0) 
            return true;
        return false;
        
    }
    
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || 
           ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        
        return false;
    }
    
   
}