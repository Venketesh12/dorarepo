import java.util.*;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a+" ");
        for(int i=0; i<=n; i++){
            sum=a+b;
            a=b;
            b=sum;
            
            System.out.print(sum+ " ");
        }
        sc.close();
        
    }
}
