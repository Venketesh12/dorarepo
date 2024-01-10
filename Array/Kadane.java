public class Kadane {
    public static void kadanes(int num[]){
        int currsum = 0, maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            currsum += num[i];
            if(currsum < 0){
                currsum = 0;
            }

            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum subarray sum is "+maxsum);
    }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
    }
}
