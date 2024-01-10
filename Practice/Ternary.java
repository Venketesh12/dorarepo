import java.util.*;

public class Ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        String result = (mark >= 33)? "pass":"fail";
        System.out.println(result);
        sc.close();
    }
}
