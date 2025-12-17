package zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        a = reader.nextInt();
        b = reader.nextInt();
        try{
            a = (int)a;
            b = (int)b;
        }catch (InputMismatchException e){
            System.out.println("Coś źle");
        }
        reader.close();

        try{
           int c = a/b ;
        }catch (ArithmeticException e){
            System.out.println("Coś źle");
        }
    }
}
