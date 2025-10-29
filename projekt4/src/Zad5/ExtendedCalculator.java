package Zad5;

public class ExtendedCalculator extends Calculator{

    public int add(int a, int b, int c){
        int suma = super.add(super.add(a,b) , c);
        return suma;
    }

    public static void main(String[] args) {
        ExtendedCalculator c1 = new ExtendedCalculator();
        System.out.println(c1.add(5,3,8));
    }

}
