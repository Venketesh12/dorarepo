import java.util.*;

public class Swap{

    public static void swapNum(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNum(a, b);
        sc.close();
    }
}
