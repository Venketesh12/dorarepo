public class PrintSubArray {

    public static void subArray(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){

            for(int j=i; j<numbers.length; j++){

                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                
                ts++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Total subarray : "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 3, 4, 5, 6, 7};
        subArray(numbers);
    }
}
