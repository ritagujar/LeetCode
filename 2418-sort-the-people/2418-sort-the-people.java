class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> hm = new HashMap<>();
        
        for(int i = 0; i < heights.length; i++)
            hm.put(heights[i], names[i]);
        
        Arrays.sort(heights);
        String res[] = new String[heights.length];
        
        for(int i = heights.length-1, j = 0; i >= 0; i--){
            res[j++] = hm.get(heights[i]);
        }
        
        return res;
    }
}