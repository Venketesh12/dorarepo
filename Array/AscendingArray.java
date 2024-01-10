public class AscendingArray {
    static void sort(int num[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(num[j] < num[i]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[] = {10, 9, 7, 4, 3, 6, 8};
        int n = num.length;
        sort(num, n);
    }
}
