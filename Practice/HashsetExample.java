import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
    
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
    }
}
