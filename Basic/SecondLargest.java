public class SecondLargest {
    public static int Largest(int num[]){
        //--Brute Force--
        // Arrays.sort(num);
        // int largest = num[num.length-1];
        // int seclargest = 0;
        // for(int i = num.length-2; i>0; i--){
        //     if(num[i] != largest){
        //         seclargest = num[i];
        //         break;
        //     }
        // }
        // return seclargest;

        //--Better approach--
        //-largest-
        // int largest = num[0];
        // for(int i=0; i<num.length; i++){
        //     if(num[i] > largest){
        //         largest = num[i];
        //     }
        // }
        // -second largest-
        // int seclargest = -1;
        // for(int i=0; i<num.length; i++){
        //     if(num[i] > seclargest && num[i] != largest){
        //         seclargest = num[i];
        //     }
        // }
        // return seclargest;

        //--Optimal Approach--
        int largest = num[0];
        int seclargest = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                seclargest = largest;
                largest = num[i];
            }
            else if(num[i] < largest && num[i] > seclargest){
                seclargest = num[i];
            }
        }
        return seclargest;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 7, 7, 5};
        System.out.println("Second largest number in the array is "+Largest(num));
        
    }
}
