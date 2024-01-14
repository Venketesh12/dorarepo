//Print the n-th row of Pascal’s triangle.
import java.util.*;

public class PascalTriangle1 {
    public static void printRow(int n){
        long ans = 1;
        System.out.print(ans+" ");

        for(int i=1; i<n; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans+" ");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int n = sc.nextInt();
        printRow(n);
        sc.close();
    }
}
