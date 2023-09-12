class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        
        Set<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            int start = i + 1;
            int end = nums.length-1;
            
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == target){
                    hs.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                } else if(sum < target)
                    start++;
                else
                    end--;
                
            }
        }
        
        output.addAll(hs);
        
        return output;
    }
}