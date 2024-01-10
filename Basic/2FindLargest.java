import java.util.*;

public class FindLargest {
    public static void largest(int num[]){
        //brute force
        Arrays.sort(num);
        System.out.println(num[num.length-1]);

        //optimal
        // int large = num[0];
        // for(int i=0; i<num.length; i++){
        //     if(num[i] > large){
        //         large = num[i];
        //     }
        // }
        // System.out.println(large);
    }
    public static void main(String[] args) {
        int num[] = {2, 5, 6, 3, 7, 1};
        largest(num);
    }
}
