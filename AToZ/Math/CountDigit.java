import java.util.*;

public class CountDigit {
    static void counts(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }

    static int counting(int num){
        int count = (int)Math.log10(num)+1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        counts(num);
        sc.close();
    }
}
