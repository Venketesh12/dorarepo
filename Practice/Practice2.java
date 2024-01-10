public class Practice2 {
    static void countfreq(int arr[], int n){
        boolean visited[] = new boolean [n];
        
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[j] == arr[i]){
                    visited[j] = true;
                    count++; 
                }
            }
            System.out.println(arr[i]+" occures "+count+" times in the array");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countfreq(arr, n);
    }
}
