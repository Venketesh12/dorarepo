import java.util.*;

public class CircleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*(r*r);
        float circumference = 2 * 3.14f * r;
        System.out.println(circumference);
        System.out.println(area);
        sc.close();
    }
}
