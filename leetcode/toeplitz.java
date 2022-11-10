class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = true;
        for(int i=0;i<m-1;i++) {
            for(int j=0;j<n-1;j++) {
             if(matrix[i+1][j+1]!=matrix[i][j]) {
                flag=false;
                break;   
            }
        }
        }
        return flag;   
        }
}