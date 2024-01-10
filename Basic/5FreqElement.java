public class FreqElement {
    static void countFreq(int num[], int n){
        //Brute force (use of two loops)
        boolean visited[] = new boolean[n]; 
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(num[i] == num[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(num[i]+" occurs "+count+" times in the array");
        }
    }
    public static void main(String[] args) {
        int num[] = {10, 5, 10, 15, 10, 5};
        int n = num.length;
        countFreq(num, n);
    }
}
