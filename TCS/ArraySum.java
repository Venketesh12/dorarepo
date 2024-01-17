import java.util.stream.*;

public class ArraySum {
    static void sum(int num[], int n){
        // Using loop
        // int sum = 0;
        // for(int i=0; i<n; i++){
        //     sum = sum + num[i];
        // }
        // System.out.println("Sum of all elements in the array : "+sum);

        // Using collection in java
        // using util.steam.*;
        int sum = IntStream.of(num).sum();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int n = num.length;
        sum(num, n);
    }
}
