public class practice {
    public static void spiral(int arr[][],int n,int m){
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;

        while(top <= bottom && left <= right){
            //right
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;

            //bottom
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;

            //left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }

            //top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
        spiral(arr, n, m);
    }
}
