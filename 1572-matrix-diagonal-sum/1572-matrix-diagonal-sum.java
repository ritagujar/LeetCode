class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int len = mat.length;
        
        for(int i = 0; i < len; i++){
            res += mat[i][i];
            res += mat[len - 1 - i][i];
        }
        
        return len % 2 == 0 ? res : res - mat[len/2][len/2];
    }
}