package zad6;

import java.util.ArrayList;

public record Order(ArrayList<Product> productList) {

    public double totalValue(){
        int suma = 0;
        for (int i = 0;i >= productList.size();i++){
            suma += productList[i].price;
        }
        return suma;
    }
}
