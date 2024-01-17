import java.util.ArrayDeque;

public class ArrayDqExample {
    public static void main(String[] args) {
        ArrayDeque<Integer>num = new ArrayDeque<>();
        num.offer(12);
        num.offerFirst(14);
        num.offerLast(40);
        num.offer(37);
        System.out.println(num);

        System.out.println(num.peek());
        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());

        System.out.println(num.poll());
        System.out.println(num);

        System.out.println(num.pollFirst());
        System.out.println(num);

        System.out.println(num.pollLast());
        System.out.println(num);
    }
}
