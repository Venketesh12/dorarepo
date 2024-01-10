public class BlockSwap {
    static void reverse(int num[], int start, int end){
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        int n = num.length;
        int k = 2;

        k = k%n;
        reverse(num, 0, k-1);
        reverse(num, k, n-1);
        reverse(num, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
    }
}
