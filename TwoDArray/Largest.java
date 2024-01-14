public class Largest {
    public static void main(String[] args) {
        int num[][] = new int [3][3];
        int n = num.length;
        int m = num[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                num[i][j] = i * m + 1 + j;
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        int largest = num[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(num[i][j] > largest){
                    largest = num[i][j];
                }
            }
        }
        System.out.println("Largest number in the array is "+largest);
    }
}
