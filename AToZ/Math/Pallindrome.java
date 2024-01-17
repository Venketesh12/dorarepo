import java.util.*;
public class Pallindrome {
    static void checkPallindrome(int original){
        int n = original;
        int rev = 0;

        while(n > 0){
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n /= 10;
        }

        if(rev == original){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        checkPallindrome(original);
        sc.close();
    }
}
