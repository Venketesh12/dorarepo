public class LinearSearch {
    public static int Changes(int marks[],int key){
        for(int i=0; i<marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {20,30,50,10,29,78};
        int key = 10;
        int index =Changes(num, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println(key +" = "+index);
        }
    }
}
