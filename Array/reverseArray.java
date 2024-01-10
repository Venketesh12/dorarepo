public class ReverseArray {
    static void reverse(int num[], int n){
        int start = 0;
        int end = n-1;

        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }

        for(int i=0; i<n; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        int n = num.length;
        reverse(num, n);
    }
}
