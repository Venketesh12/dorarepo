public class LinearSearch {
    public static int Search(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {10,20,30,40,50,60,70};
        int key = 40;

        int index = Search(numbers, key);
        System.out.println("Index of "+key+" is "+index);
    }
}
