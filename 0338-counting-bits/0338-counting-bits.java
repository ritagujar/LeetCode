class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);
            int count = countOnce(Long.parseLong(binary));
            res[i] = count;
        }
        return res;
    }
    
    public int countOnce(long binary){
        int count = 0;
        while(binary != 0){
            long digit = binary % 10;
            if(digit == 1)
                count++;
            
            binary /= 10;
        }
        
        return count;
    }
    
}