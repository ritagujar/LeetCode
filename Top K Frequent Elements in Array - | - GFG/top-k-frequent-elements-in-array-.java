//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0)+ 1);
        }
        
        List<Map.Entry<Integer, Integer>> al = new ArrayList<>(hm.entrySet());
        al.sort((a,b) -> Objects.equals(a.getValue(), b.getValue()) ? b.getKey() - a.getKey() : b.getValue() - a.getValue());
        
        int[] ans = new int[k];
        
        for(int i = 0; i < k; i++){
            ans[i] = al.get(i).getKey();
        }
        
        return ans;
    }
}