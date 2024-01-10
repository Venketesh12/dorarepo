public class FindSmallest1 {
    public static int smallest(int num[]){
        //using sort
        // Arrays.sort(num);
        // return num[0];

        //using min variable
        int min = num[0];
        for(int i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int num[] = {2, 5, 7, 1, 90};
        System.out.println("Smallest number in the array is "+smallest(num));
    }
}
