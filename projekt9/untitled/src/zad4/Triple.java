package zad4;

public class Triple <T, U, V>{
    T obiekt1;
    U obiekt2;
    V obiekt3;

    public Triple(T obiekt1, U obiekt2, V obiekt3) {
        this.obiekt1 = obiekt1;
        this.obiekt2 = obiekt2;
        this.obiekt3 = obiekt3;
    }

    public T getFirst() {
        return obiekt1;
    }

    public U getSecond() {
        return obiekt2;
    }

    public V getThird() {
        return obiekt3;
    }

    public static void main(String[] args) {
        String napis = "Halo";
        int liczba = 5;
        double zmienno = 2.6;
        Triple tri = new Triple(napis,liczba,zmienno);
        System.out.println(tri.getFirst());
        System.out.println(tri.getSecond());
        System.out.println(tri.getThird());
    }
}
