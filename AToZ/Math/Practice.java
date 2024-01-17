public class Practice {
    public static void passbyreference(StringBuilder name){
        name.append("Dora");
    }
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        name.append("Venketesh");
        System.out.println();
    }
}
