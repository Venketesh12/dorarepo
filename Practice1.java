import java.util.*;

public class Practice1{
    public static int Greatest(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Greatest(a, b));

        
        sc.close();
    }
}
