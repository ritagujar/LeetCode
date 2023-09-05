class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str = "";
        
        for(String word: words){
            str += word.charAt(0);
        }
        
        if(str.equals(s))
            return true;
        return false;
    }
}