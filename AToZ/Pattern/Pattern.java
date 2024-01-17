package Pattern;
import java.util.*;

public class Pattern {
    static void print1(int n){

        for(int i = 0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void print5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void print7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
 
            for(int j=1; j<=(2*n)-(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print9(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void print10(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print11(int n){
        int start = 1;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0)start = 1;
            else start = 0;
            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    static void print12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void print13(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void print14(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+i-1; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void print15(int n){
        for(int i=n; i>=1; i--){
            for(char ch='A'; ch<='A'+i-1; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void print16(int n){
        for(int i=1; i<=n; i++){
            char ch = (char) ('A'+i-1);
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void print17(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2*i-1) / 2;
            for(int j=1; j<=2*i-1; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
    static void print18(int n){
        for(int i=1; i<=n; i++){
            for(char ch = (char) ('E'- i+1); ch <= 'E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void print19(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }

            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }

            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }

            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }
            
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print20(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int j=1; j<=2*n-2*i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print21(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    static void print22(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2 * n-2)-j;
                int bottom = (2 * n-2)-i;

                //System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right))+" ");

                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            print22(n);
        }
        sc.close();
    }
}
