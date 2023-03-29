public class LargestNumArray {
    public static int getLargsest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] = {110,23,45,32,89};
        System.out.println("Largest number in the array is : "+getLargsest(num));

    }
}
