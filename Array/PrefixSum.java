public class PrefixSum{
    public static void prefixSums(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int [num.length];
        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        System.out.println("Maximum subarray sum is "+maxsum);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        prefixSums(num);
    }
}
