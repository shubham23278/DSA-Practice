class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(r*c != n*m) return mat;
        
        int[][] new_mat = new int[r][c];
        int new_row = 0;
        int new_col = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                new_mat[new_row][new_col] = mat[i][j];
                new_col++;
                if(new_col == c){
                    new_col = 0;
                    new_row++;
                }
            }
        }
        return new_mat;
    }
}
