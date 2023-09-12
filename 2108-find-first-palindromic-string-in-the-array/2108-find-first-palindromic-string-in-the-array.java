class Solution {
    public String firstPalindrome(String[] words) {
        StringBuffer sb = null;
        for(String word: words){
            sb = new StringBuffer(word);
            if(sb.reverse().toString().equals(word))
                return word;
        }
        
        return "";
    }
}