public class AddElement {
    static void add(int num[], int n, int value){
        for(int i=n-1; i>=0; i--){
            num[i+1] = num[i];
        }
        num[0] = value;
    }

    public static void main(String[] args) {
        int n = 4;
        int num[] = {2, 4, 6, 8, 10};
        int value = 3;

        add(num, n, value);

        for(int i=0; i<=n; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
