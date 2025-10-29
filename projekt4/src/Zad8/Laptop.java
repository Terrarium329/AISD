package Zad8;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop extends Computer{
    public int weight;

    public Laptop(String manufacturer, int model, ArrayList<Double> partsPrices, int weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return weight == laptop.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", model=" + model +
                ", partsPrices=" + partsPrices +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(99.9);
        a1.add(9.99);
        Laptop l1 = new Laptop("Winrar",292102,a1,10);
        System.out.println(l1.toString());
    }

}
