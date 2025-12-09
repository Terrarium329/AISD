//Napisz klasę Product z polami id (typu int), name (typu String) oraz price (typu double).
// Zaimplementuj interfejs Comparator do
// porównywania obiektów po polu price (od najniższej do najwyższej ceny), a w przypadku równości po polu id.
// Stwórz listę 5 obiektów klasy Product i posortuj ją zgodnie z opisanym kryterium.

package zad4;

import java.util.ArrayList;
import java.util.Comparator;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + price + " - " + id;
    }



    static void main() {
        ArrayList<Product> lysta = new ArrayList<>();
        lysta.add(new Product(2,"Coś",100));
        lysta.add(new Product(3,"Coś",200));
        lysta.add(new Product(1,"Coś",100));
        lysta.add(new Product(4,"Coś",300));
        lysta.add(new Product(5,"Coś",500));
        System.out.println(lysta);
        lysta.sort(new Sorting());
        System.out.println(lysta);
    }
}
class Sorting implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        if (Double.compare(o1.price,o2.price) != 0){
            return Double.compare(o1.price,o2.price);
        }else{
            return Integer.compare(o1.id,o2.id);
        }
    }
}

