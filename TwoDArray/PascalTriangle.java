public class PascalTriangle {
    //Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.
    public static int nCr(int n, int r){
        long result = 1;
        for(int i=0; i<r; i++){
            result = result * (n-i);
            result = result / (i+1);
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int row = 6;
        int col = 4;
        int element = nCr(row-1, col-1);
        System.out.println("Element at row "+row+" and col "+col+" is "+element);
    }
}
