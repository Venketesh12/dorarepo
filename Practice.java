import java.util.*;

public class Practice {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
             if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
            sc.close();
        }while(true);
    }
}
