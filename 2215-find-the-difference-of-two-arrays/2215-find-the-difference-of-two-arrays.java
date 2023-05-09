class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();
        
        for(int i: nums1)
                setOne.add(i);
        
        for(int i: nums2)
                setTwo.add(i);
        
        List<Integer> listOne = new ArrayList(setOne);
        List<Integer> listTwo = new ArrayList(setTwo);
        
        listOne.removeAll(setTwo);
        listTwo.removeAll(setOne);
        
        List<List<Integer>> listRes = new ArrayList();
        
        listRes.add(listOne);
        listRes.add(listTwo);
        
        return listRes;
    }
}