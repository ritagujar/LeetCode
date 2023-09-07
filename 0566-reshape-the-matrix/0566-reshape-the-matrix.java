class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] resultMatrix = new int[r][c];
        
        int row = mat.length;
        int col = mat[0].length;
        
        int output_r = 0;
        int output_c = 0;
        
        if(row * col != r * c) return mat;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                resultMatrix[output_r][output_c] = mat[i][j];
                output_c++;
                
                if(output_c == c){
                    output_c = 0;
                    output_r++;
                }
            }
        }
        
        return resultMatrix;
       
    }
}