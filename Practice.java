import java.util.*;

public class Practice{
   public static int sumOfTwo(int a, int b){
     int sum = a + b;
     return sum;
   }

   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println(sumOfTwo(a, b));
     sc.close();
  }
}
