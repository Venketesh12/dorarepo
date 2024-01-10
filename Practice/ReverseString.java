import java.util.*;

public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int Length=name.length();
        String rev="";

        for(int i=Length-1; i>=0; i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        sc.close();
    }
}
