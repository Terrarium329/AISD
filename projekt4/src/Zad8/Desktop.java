package Zad8;

import java.util.ArrayList;
import java.util.Objects;

public class Desktop extends Computer{
    public int caseType;

    public Desktop(String manufacturer, int model, ArrayList<Double> partsPrices, int caseType) {
        super(manufacturer, model, partsPrices);
        this.caseType = caseType;
    }

    public int getCaseType() {
        return caseType;
    }

    public void setCaseType(int caseType) {
        this.caseType = caseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Desktop desktop = (Desktop) o;
        return caseType == desktop.caseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caseType);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "caseType=" + caseType +
                ", manufacturer='" + manufacturer + '\'' +
                ", model=" + model +
                ", partsPrices=" + partsPrices +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(30.2);
        a1.add(100.5);
        a1.add(499.0);
        Desktop d1 = new Desktop("Winrar",292102,a1,72);
        System.out.println(d1.toString());
    }

}
