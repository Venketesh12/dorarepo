import java.util.Scanner;

public class Prime {
    //Brtue force
    //TC = O(n)
    // public static void isPrime(int num){
    //     int count = 0;
    //     for(int i=1; i<=num; i++){
    //         if(num % i == 0){
    //             count++;
    //         } 
    //     }

    //     if(count == 2){
    //         System.out.println("Prime number");
    //     }else{
    //         System.out.println("Not prime");
    //     }
    // }

    //OPTIMAL APPROACH
    //TC = O(sqrt(n))
    public static void prime(int num){
        int count = 0;
        for(int i=1; i*i <= num; i++){
            if(num % i == 0){

                count++;
                if((num / 2) != 0){
                    count++;
                }
            }
        }

        if(count == 2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
        sc.close();
    }
}
