import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        //Creating list
        List<Integer>num = new ArrayList<>();
        //ADD TC = O(n)
        //add something to the list
        num.add(20);
        num.add(30);
        num.add(40);
        //print list
        //System.out.println(num);

        //again add something
        num.add(50);
        //System.out.println(num);

        //add something at the specific index
        num.add(0, 10);
        //System.out.println(num);

        //add two list
        List<Integer>newlist = new ArrayList<>();
        newlist.add(80);
        newlist.add(70);
        num.addAll(newlist);
        System.out.println(num);

        //get element from specific index
        //System.out.println(num.get(2));

        //REMOVE TC=O(n)
        //remove elements using index
        //num.remove(3);
        //System.out.println(num);
        
        //remove element directly
        //num.remove(Integer.valueOf(70));
        //System.out.println(num);

        //remove entire elements
        //num.removeAll(num);
        //System.out.println(num);

        //UPDATE TC = O(1)
        //update element 
        //num.set(3, 100);
        //System.out.println(num);

        //CONTAIN
        //check element
        //System.out.println(num.contains(4));

        //ITERATE
        //using for loop
        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

        //using for each loop
        for (Integer it : num) {
            System.out.println("for each "+it);
            
        }

        //Iterator
        Iterator <Integer>it = num.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
