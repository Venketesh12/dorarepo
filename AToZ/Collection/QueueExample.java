import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>num = new LinkedList<>();

        num.offer(12);
        num.offer(14);
        num.offer(16);
        System.out.println(num);

        System.out.println(num.peek());
        
        System.out.println(num.poll());

        System.out.println(num.peek());
        System.out.println(num);
    }   
}
