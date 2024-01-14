import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static List<Integer>printSpiral(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer>spiral = new ArrayList<>();
        while(top <= bottom && left <= right){
            //right
            for(int i=left; i<=right; i++){
                // System.out.print(matrix[top][i]+" ");
                spiral.add(matrix[top][i]);
            }
            top++;

            //bottom
            for(int i=top; i<=bottom; i++){
                // System.out.print(matrix[i][right]+" ");
                spiral.add(matrix[i][right]);
            }
            right--;

            //right
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    // System.out.print(matrix[bottom][i]+" ");
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    // System.out.print(matrix[i][left]+" ");
                    spiral.add(matrix[i][left]);

                }
                left++;
            }
        }
        return spiral;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer>result = Practice1.printSpiral(matrix);
        System.out.println(result);
    }
    
}
