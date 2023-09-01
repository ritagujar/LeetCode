class Solution {
    public int[] leftRightDifference(int[] nums) {
       int rs = 0;
        int ls = 0;
        
        
        for(int i = 0; i < nums.length; i++){
            rs += nums[i];
        }
        
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            rs -= val;
            nums[i] = Math.abs(rs - ls);
            ls += val;
        }
        
        return nums;
    }
}