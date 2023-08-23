class Solution {
    public int findFinalValue(int[] nums, int original) {
        int multiple = original;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num: nums)
            hs.add(num);
        
        while(hs.contains(multiple))
            multiple *= 2;
        
        return multiple;
    }
}