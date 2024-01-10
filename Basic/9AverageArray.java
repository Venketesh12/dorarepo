public class AverageArray {
    static void average(int num[]){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum = num[i] + sum;
        }
        int avg = sum / num.length;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        average(num);
        }   
}   
