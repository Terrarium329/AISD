package zad6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Klawiatura",30.0);
        Product p2 = new Product("Xbox",200.50);
        ArrayList<Product> lista1 = new ArrayList<Product>();
        lista1.add(p1);
        lista1.add(p2);
    }
}
