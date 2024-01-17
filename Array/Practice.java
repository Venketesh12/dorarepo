public class Practice {
    public static int subArraySum(int num[], int n){
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<i; j++){
                for(int k=i; k<j; k++){
                    int sum = 0;
                    sum += num[k];
                    maxsum = Math.max(maxsum, sum);
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = num.length;
        int maximum = subArraySum(num, n);
        System.out.println(maximum);
    }
}
