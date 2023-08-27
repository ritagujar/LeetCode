class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(hs.containsKey(target - nums[i]))
                return new int[]{hs.get(target-nums[i]), i};
            else
                hs.put(nums[i], i);
        }
        
        return new int[2];
    }
}