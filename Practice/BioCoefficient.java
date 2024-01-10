public class BioCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binoCo(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int bf = n_fact/(r_fact * nmr_fact);
        return bf;
    }

    public static void main(String args[]){
        System.out.println(binoCo(5, 2));
    }
}
