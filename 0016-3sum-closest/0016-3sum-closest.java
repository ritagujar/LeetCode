class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minClosest = 0;
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            int start = i+1;
            int end = nums.length-1;
            
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == target)
                    return sum;
                
                else if(sum < target)
                    start++;
                else
                    end--;
                
                int diff = Math.abs(sum - target);
                if(diff < min){
                    min = diff;
                    minClosest = sum;
                }
            }
        }
        
        return minClosest;
    }
}