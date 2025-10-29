package Zad8;
import java.util.ArrayList;
import java.util.Objects;

public class Computer {
    public String manufacturer;
    public int model;
    public ArrayList<Double> partsPrices;

    public Computer(String manufacturer, int model, ArrayList<Double> partsPrices) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.partsPrices = partsPrices;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public ArrayList<Double> getPartsPrices() {
        return partsPrices;
    }

    public void setPartsPrices(ArrayList<Double> partsPrices) {
        this.partsPrices = partsPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return model == computer.model && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(partsPrices, computer.partsPrices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, partsPrices);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model=" + model +
                ", partsPrices=" + partsPrices +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(50.2);
        a1.add(20.11);
        a1.add(499.0);
        Computer c1 = new Computer("Winrar",292102,a1);
        Computer c2 = new Computer("Winrar",292102,a1);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }

}
