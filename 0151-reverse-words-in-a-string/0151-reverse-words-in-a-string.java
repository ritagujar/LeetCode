class Solution {
    public String reverseWords(String s) {
        String str[] = s.split("\\s+");
        String reversedString = "";
        
        for(int i = str.length - 1; i >= 0; i--){
            reversedString += str[i] + " ";
        }
        
        return reversedString.trim();
    }
}