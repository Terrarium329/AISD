package generics;

public class Box <T,U>{
    T oviekt;
    T oviekt2;
    U oviekt3;

    public Box(T oviekt,T oviekt2, U oviekt3) {
        this.oviekt = oviekt;
        this.oviekt2 = oviekt2;
        this.oviekt3 = oviekt3;
    }

    public T getOviekt() {
        return oviekt;
    }

    public void setOviekt(T oviekt) {
        this.oviekt = oviekt;
    }

    public T getOviekt2() {
        return oviekt2;
    }

    public void setOviekt2(T oviekt2) {
        this.oviekt2 = oviekt2;
    }
}
