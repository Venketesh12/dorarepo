// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // Set<Integer>set = new LinkedHashSet<>();
        Set<Integer>set = new TreeSet<>();
        set.add(12);
        set.add(14);
        set.add(11);
        set.add(12);
        set.add(32);
        set.add(18);

        System.out.println(set);
        set.remove(12);
        System.out.println(set);
        System.out.println(set.contains(54));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
