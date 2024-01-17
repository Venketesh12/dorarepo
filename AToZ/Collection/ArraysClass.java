import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50, 60};
        int index = Arrays.binarySearch(num, 40);
        System.out.println("Number found at index "+index);

        int num2[] = {101, 4, 6, 2, 4, 8, 100};
        Arrays.sort(num2);

        Arrays.fill(num2, 11);
        for(int i : num2){
            System.out.print(i+" ");
        }
    }
}
