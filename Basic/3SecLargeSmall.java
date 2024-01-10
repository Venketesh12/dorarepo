public class SecLargeSmall {
    static void largeSmall(int num[], int n){
        int smallest = num[0];
        int secsmallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(num[i] < smallest){
                secsmallest = smallest;
                smallest = num[i];
            }
            else if(num[i] > smallest && num[i] < secsmallest){
                secsmallest = num[i];
            }
        }
        System.out.println("Second smallest = "+secsmallest);

        int largest = num[0];
        int seclargest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(num[i] > largest){
                seclargest = largest;
                largest = num[i];
            }
            else if(num[i] < largest && num[i] > seclargest){
                seclargest = num[i];
            }
        }
        System.out.println("Second largest = "+seclargest);
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 6, 7, 7, 5};
        int n = 6;
        largeSmall(num, n);
    }
}
