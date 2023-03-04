public class Practice{
    public static int getLargest(int num[],int largest){
        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int num[] = {20,30,10,50,600};
        int largest = Integer.MIN_VALUE;
        System.out.println(getLargest(num, largest));
    }
}
