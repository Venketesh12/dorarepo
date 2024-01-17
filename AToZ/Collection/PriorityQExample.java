import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer>num = new PriorityQueue<>(Comparator.reverseOrder());
        num.offer(40);
        num.offer(14);
        num.offer(12);
        num.offer(16);

        System.out.println(num);

        System.out.println(num.peek());
        num.poll();
        System.out.println(num);
        System.out.println(num.peek());
    }
}
