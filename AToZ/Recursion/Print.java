package Recursion;
public class Print {
    public static void print(int count){
        if(count == 0){
            return;
        }
        System.out.println(count);
        count--;
        print(count);
    }
    public static void main(String[] args) {
        int count = 5;
        print(count);
    }
}
