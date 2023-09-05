class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        Set<Integer> map = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j])
                    map.add(nums1[i]);
            }
            for(int j = 0; j < nums3.length; j++){
                if(nums1[i] == nums3[j])
                    map.add(nums1[i]);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums3.length; j++){
                if(nums2[i] == nums3[j])
                    map.add(nums2[i]);
            }
        }
        
         List<Integer> list = new ArrayList<>(map);
        return list;
        
    }
}