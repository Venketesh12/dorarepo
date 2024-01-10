public class secondLargest {
    public static void main(String args[]){
        int arr[] = {1,3,10,4,7};
        
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int sec = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > sec && arr[i] != largest){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
