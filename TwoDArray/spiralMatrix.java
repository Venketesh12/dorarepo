import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer>spiralOrder(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer>result = new ArrayList<>();

        while(top <= bottom && left <= right){
            //right
            for(int i=left; i<=right; i++){
                result.add(arr[top][i]);
            }
            top++;

            //bottom
            for(int i=top; i<=bottom; i++){
                result.add(arr[i][right]);
            }
            right--;

            //left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }

            //top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralMatrix spiralObj = new spiralMatrix();
        List<Integer> result = spiralObj.spiralOrder(arr);
        System.out.println(result);
        
    }
}
