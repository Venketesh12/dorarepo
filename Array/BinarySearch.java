import java.util.*;

public class BinarySearch {
    //O(logn)
    public static int searchBinary(int numbers[], int key ){
        int start = 0, end = numbers.length-1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {34, 56, 12, 67, 89, 96, 84};
        int key = 96;

        System.out.println("Key is found at index : "+searchBinary(numbers, key));
        sc.close();
    }

}

