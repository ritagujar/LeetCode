class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        String res = "";
        
        char c[] = s.toCharArray();
        
        while(start < end){
             if(isVovel(c[start]) && isVovel(c[end])){
                char ch = c[start];
                c[start] = c[end];
                c[end] = ch;
                
                start++;
                end--;
            }
            else if(isVovel(c[start]) && !isVovel(c[end]))
                end--;
            else if(!isVovel(c[start]) && isVovel(c[end]))
                start++;
            else {
                start++;
                end--;
            }
            
        }
        
        for(int i = 0; i < c.length; i++){
           res += c[i];
        }
        return res;
    }
    
    public boolean isVovel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        
        return false;
    }
}