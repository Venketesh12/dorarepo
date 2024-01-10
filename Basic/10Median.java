import java.util.*;

public class Median {
    static void findMedian(int num[], int n){
        Arrays.sort(num);

        if(n % 2 == 0){
            int ind1 = (n/2) - 1;
            int ind2 = n/2;
            System.out.println((double) (num[ind1] + num[ind2])/2);
        }else{
            System.out.println(num[n/2]);
        }
        
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12};
        int n = num.length;
        System.out.println("Median of the array is ");
        findMedian(num, n);
    }  
}
