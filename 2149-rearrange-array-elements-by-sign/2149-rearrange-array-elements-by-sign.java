class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int div =l/2;
        
        int pos[] = new int[div];
        int neg[] = new int[div];
        int res[] = new int[l];
        
        for(int i = 0, k = 0, j = 0; i < l; i++)
        {
            if(nums[i] > 0){
                pos[j] = nums[i]; 
                j++;
            }
            else{
                neg[k] = nums[i];
                k++;
            }
        }
       
         for(int i = 0, x = 0, y = 0; i < l; i++)
        {
            if(i%2 == 0){
               res[i] = pos[x];
                x++;
            }
             
            else
            {
                res[i] = neg[y];
                y++;
            }
        }
        return res;
        
    }
}