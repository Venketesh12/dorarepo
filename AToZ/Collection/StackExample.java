import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String>animal = new Stack<>();

        animal.push("Lion");
        animal.push("Cow");
        animal.push("cat");

        System.out.println(animal);
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal);
        System.out.println(animal.peek());

    }
}
