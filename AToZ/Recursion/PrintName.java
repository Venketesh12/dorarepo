package Recursion;
public class PrintName {
    static int count = 0;
    static void print(){
        if(count == 5){
            return;
        }
        String name = "Dora";
        System.out.println(name);
        count++;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
