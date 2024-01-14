import java.util.*;

public class Input {
    public static boolean search(int marks[][], int key){
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[0].length; j++){
                if(marks[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int marks[][] = new int[3][3];
        int n = marks.length;
        int m = marks[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        search(marks, key);
        
        sc.close();
    }
}
