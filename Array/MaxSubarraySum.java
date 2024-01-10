public class MaxSubarraySum {
    //Brute Force
    public static void maxsubarray(int numbers[]){
        int currsum = 0, maxsum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currsum = 0;
                for(int k=i; k<=j; k++){
                    currsum += numbers[k];
                }
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum subarray sum = "+maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxsubarray(numbers);
    }
}
