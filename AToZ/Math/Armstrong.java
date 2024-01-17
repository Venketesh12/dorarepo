import java.util.*;

public class Armstrong {
    static void check(int num){
        int dup = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += (int)Math.pow(digit,3);
            num = num / 10;
        }

        if(sum == dup) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
        sc.close();
    }
}
