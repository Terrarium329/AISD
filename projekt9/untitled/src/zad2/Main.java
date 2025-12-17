package zad2;

public class Main {
    public static void main(String[] args) {

        String napis1 = "Arr";
        String napis2 = "Arr";
        System.out.println(isEqual(napis1,napis2));
        int a = 6;
        int b = 6;
        System.out.println(isEqual(a,b));
        b += 1;
        System.out.println(isEqual(a,b));

    }
    public static <T> boolean isEqual(T obiekt1, T obiekt2){
        return obiekt1.equals(obiekt2);
    }
}
