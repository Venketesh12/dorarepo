public class RmoveDupliUnsort {
    static void rud(int num[], int n){
        int marks[] = new int [n];

        for(int i=0; i<n; i++){
            marks[i] = 1;
        }

        for(int i=0; i<n; i++){
            if(marks[i] == 1){
                for(int j=i+1; j<n; j++){
                    if(num[i] == num[j]){
                        marks[i] = 0;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            if(marks[i] == 1){
                System.out.print(num[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 2, 4, 8, 8, 9};
        int n = num.length;
        rud(num, n);
    }
}
