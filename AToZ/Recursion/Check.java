package Recursion;

public class Check {
    static void print(int n){
        System.out.println(n);
        print(n);
    }
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
}
