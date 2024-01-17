import java.util.*;
import java.util.Collections;
//using print
public class PrintDivisors {
    static void printd(int num){
        List<Integer>see = new ArrayList<>();
        //INPUT LIST
        //O(sqrt(n));
        for(int i=1; i*i <= num; i++){
            if(num % i == 0){
                see.add(i);

                if((num/i) != i){
                    see.add(num/i);
                }
            }
        }

        //SORT LIST
        //O(n log n) 
        Collections.sort(see);

        //PRINT LIST
        //O(n)
        for(int it : see){
            System.out.print(it+" ");
        }

    }

    static void printdiv(int num){
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }

//using arraylist
    static List<Integer> printDivisors(int num){
        // int arr[] = new int [0];
        // arr[0] = 1;
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                arr.add(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printd(num);
        sc.close();
    }
}
