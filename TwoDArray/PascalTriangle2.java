import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static List<Integer> generateRows(int row){
        long ans = 1;
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans / col;
            result.add((int)ans);
        }
        return result;
    }

    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
    
        for(int i=1; i<=n; i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for(List<Integer> it : ans){
            for(int ele : it){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
