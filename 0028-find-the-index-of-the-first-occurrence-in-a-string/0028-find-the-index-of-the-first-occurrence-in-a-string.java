class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        
        int start = 0;
        int end = len;
        int res = -1;
        
        for(int i = 0; i < haystack.length()-(end-1); ){
            if(haystack.substring(i, i+end).equals(needle)){
                res = i;
                break;
            } else{
                i++;
            }
            
        }
        
        return res;
    }
}