public class ReverseArray {
    // static void reverse(int num[], int n){
        //Brute force
        // int reverse[] = new int [n];
        // for(int i=n-1; i>=0; i--){
        //     reverse[n-i-1] = num[i];
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(reverse[i]+" ");
        // }
        // System.out.println();

        //Optimal approach
        // int start = 0;
        // int end = n-1;

        // while(start < end){
        //     int temp = num[start];
        //     num[start] = num[end];
        //     num[end] = temp;

        //     start++;
        //     end--;
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(num[i]+" ");
        // }

    // }
        //Using recursive method
        static void reverse(int num[], int start, int end){
            // in recursive call we write if instead of while
            if(start < end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;

                //recursive call
                reverse(num, start+1, end-1);
            }
            
        }

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50};
        int n = 5;
        reverse(num, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
    }
}
