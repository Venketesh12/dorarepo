import java.util.*;

public class input {
    public static void main(String[] args) {
        //Initialize
        int num[][] = new int[3][3];
        int n = num.length, m = num[0].length;
        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                num[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
