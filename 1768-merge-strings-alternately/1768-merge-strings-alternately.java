class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        int maxLength = 0;
        
        if(word1Length > word2Length)
            maxLength = word1Length;
        else
            maxLength = word2Length;
        
        for(int i = 0; i < maxLength; i++){
            if(i < word1.length())
                res += word1.charAt(i);
            
            if(i < word2.length())
                res += word2.charAt(i);
        }
        
        return res;
        
    }
}