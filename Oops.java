import java.util.*;

public class Oops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String rev="";
        String name = sc.next();

        for(int i=name.length()-1; i>=0; i--){
            rev=rev+name.charAt(i);
        }
        System.out.print(rev);
        sc.close();
    }
}
