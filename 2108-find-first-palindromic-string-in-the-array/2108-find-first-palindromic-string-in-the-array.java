class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(isPalindrom(word))
                return word;
        }
        
        return "";
    }
    
    public boolean isPalindrom(String word) {
        String res = "";
        
        for(int i = word.length()-1; i >= 0; i--)
            res += word.charAt(i);
        
        if(res.equals(word))
            return true;
        return false;
    }
}