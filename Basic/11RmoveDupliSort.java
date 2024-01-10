//import java.util.HashSet;

public class RmoveDupliSort {
    static int removeD(int num[]){
        //Brute force
        // create a Hashset
        // HashSet<Integer> set = new HashSet<>();
        // add element to the set
        // for(int i=0; i<num.length; i++){
        //     set.add(num[i]);
        // }
        // size of the set
        // int k = set.size();
        // put the unique elements to the starting of array
        // int j = 0;
        // for(int x : set){
        //     num[j] = x;
        //     j++;
        // }
        // return k;
        //TC = O(n*log(n)) + O(n)
        //SC = O(n)

        //Optimal force
        int i=0;
        for(int j=1; j<num.length; j++){
            if(num[i] != num[j]){
                num[i+1] = num[j];
                i++;
            }
        }
        return i+1;
        //TC = O(n)
        //SC = O(1)
    }

    public static void main(String[] args) {
        int num[] = {2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
        int k = removeD(num);
        for(int i=0; i<k; i++){
            System.out.print(num[i]+" ");
        }
    }
}
