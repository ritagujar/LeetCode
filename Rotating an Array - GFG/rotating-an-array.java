//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int d = Integer.parseInt(br.readLine().trim());

            new Solution().leftRotate(arr, n, d);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        
        int k = d % n;
        
        // reverseArray(arr, 0, arr.length-k-1);
        // reverseArray(arr, arr.length-k, arr.length-1);
        // reverseArray(arr, 0, arr.length-1);
        
        
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);
    }
    
    void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = (int)arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
