import java.util.*;

public class RearrangeArr {
    public static void main(String[] args) {
        int num[] = {6, 2, 4, 8, 15, 10};
        int n = num.length;

        Arrays.sort(num);
        for(int i=0; i<n/2; i++){
            System.out.print(num[i]+" ");
        }
        for(int i=n-1; i>=n/2; i--){
            System.out.print(num[i]+" ");
        }
    }
}
