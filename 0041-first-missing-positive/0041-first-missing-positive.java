class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;
        
        int len = nums.length;
        boolean containOne = false;
        
        for(int i = 0; i < len; i++){
            if(nums[i] == 1){
                containOne = true;
            } else if((nums[i] <= 0) || (nums[i] > len)){
                nums[i]  = 1;
            }
        }
                      
        if(containOne == false)
            return 1;
                      
        for(int i = 0; i < len; i++){
            int index = Math.abs(nums[i]) -1;
            if(nums[index] > 0)
                nums[index] = -1 * nums[index];
        }
                      
        for(int i = 0; i < len; i++){
            if(nums[i] > 0)
                return i+1;
        }
               
        // [1, 2, 3] => output => 4
        return len+1;
    }
}