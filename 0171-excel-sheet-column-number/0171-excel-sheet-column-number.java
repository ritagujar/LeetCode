class Solution {
    public int titleToNumber(String columnTitle) {
        int number = 0;
        
        for(int i = 0; i < columnTitle.length(); i++){
            int digit = columnTitle.charAt(i) - 'A' + 1;
            System.out.println(digit);
            number = number * 26 + digit;
        }
        
        return number;
    }
}