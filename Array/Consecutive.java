public class Consecutive {
    static int maxCons(int num[], int n){
        int count = 0; 
        int max = 0;

        for(int i=0; i<n; i++){
            if(num[i] == 1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static void main(String[] args) {
        int num[] = {0,1,1,1,1,1,0,0,1,1,0,0,1,1,1,1};
        int n = num.length;
        System.out.println(maxCons(num, n));
    }
}
