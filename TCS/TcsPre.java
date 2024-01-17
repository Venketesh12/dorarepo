public class TcsPre {
    
    static void triangular(int matrix[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                matrix[i][j] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
        int n = matrix.length;
        int m = matrix[0].length;
        triangular(matrix, n, m);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    
    
    
}
