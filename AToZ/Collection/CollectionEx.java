import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionEx {
    public static void main(String[] args) {
        List<Integer>num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(9);
        num.add(9);
        num.add(19);

        System.out.println("smallest number in the list is "+ Collections.min(num));

        System.out.println("largest number in the list is "+ Collections.max(num));

        System.out.println(Collections.frequency(num, 9));

        Collections.sort(num);
        System.out.println(num);

        Collections.sort(num, Comparator.reverseOrder());
        System.out.println(num);
    }
}
