public class Oops {
    void sqare(int side){
        int area = side * side;
        System.out.println("area of square = "+area);
    }

    void rec (int a, int b){
        int area = a*b;
        System.out.println("area of rec = "+area);
    }

    void circle(int r){
        double area =3.14*r*r ;
        System.out.println("area of circle = "+area);
    }
    public static void main(String args[]){
        Oops obj=new Oops();
        obj.circle(5);
        obj.rec(10, 20);
        obj.sqare(6);

       
    }
}
