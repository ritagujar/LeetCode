class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        int leftSum = 0;
        int val = 0;
        
        for(int num : nums){
            rightSum += num;
        }
        
        for(int i = 0; i < nums.length; i++){
            val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums;
    }
}