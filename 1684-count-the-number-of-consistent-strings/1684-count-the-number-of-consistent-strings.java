class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for(String word: words){
            boolean isValid = true;
            
            for(char ch: word.toCharArray()){
                if(!allowed.contains(String.valueOf(ch)))
                    isValid = false;
            }
            
            if(isValid)
                count++;
        }
        
        return count;
    }
}