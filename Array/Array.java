public class Array {
    public static void update(int marks[],int non){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {20,10,30};
        int non = 5;
        update(marks,non);
        System.out.println(non);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
