import java.util.Arrays;

public class RepeatElem {
    static void findRepeat(int num[], int n){
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(num[j] < num[i]){
        //             int temp = num[i];
        //             num[i] = num[j];
        //             num[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(num);
        for(int i=0; i<n-1; i++){
            if(num[i] == num[i+1]){
                System.out.print(num[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {2, 1, 1, 4, 4, 3, 3, 5, 2};
        int n = num.length;
        findRepeat(num, n);
    }
}
