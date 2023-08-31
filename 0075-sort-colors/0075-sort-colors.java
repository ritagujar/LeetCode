class Solution {
    public void sortColors(int[] nums) {
        int res[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
           for(int j = 0 ;j < nums.length-1; j++){
               if(nums[i] < nums[j]){
                   int temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
           }
        }
        
    }
}