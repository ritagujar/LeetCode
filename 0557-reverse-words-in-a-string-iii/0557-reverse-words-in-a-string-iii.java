class Solution {
    public String reverseWords(String s) {
         String res = "";
        
        String words[] = s.split(" ");
        
        for(String word: words){
            for(int i = word.length() - 1; i >= 0; i--)
                res += word.charAt(i);
            
            res += " ";
        }
        
        return res.trim();
    }
}