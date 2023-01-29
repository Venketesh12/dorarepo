import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int temp = 0;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                temp++;
                break;
            }
        }

        if(temp == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
