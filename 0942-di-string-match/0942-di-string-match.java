class Solution {
    public int[] diStringMatch(String s) {
        int result[] = new int[s.length() + 1];
        int right = 0;
        int left = s.length();
        
        for(int i = 0; i < s.length(); i++){
            result[i] = s.charAt(i) == 'I' ? right++ : left--;
        }
        result[s.length()] = left;
        
        return result;
    }
}