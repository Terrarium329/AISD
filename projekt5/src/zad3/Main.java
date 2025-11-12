package zad3;

public class Main {
    public static void main(String[] args) {
        PointC punkt1 = new PointC(4.0,3.0);
        System.out.println(punkt1.toPointR());

        PointR punkt2 = new PointR(2.0,1.5);
//        System.out.println(punkt2.toPointC());
        PointC punkt3 = punkt2.toPointC(punkt2);
        System.out.println(punkt3.x);
        System.out.println(punkt3.y);
    }
}
