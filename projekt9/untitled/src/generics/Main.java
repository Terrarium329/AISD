package generics;

public class Main {
    public static void main(String[] args) {
        Animal kot1 = new Animal("Filemon");
        Animal kot2 = new Animal("M");
        String napis = "Halo";
        Box<Animal,String> pudlo = new Box<>(kot1,kot2,napis);
        pudlo.getOviekt().dajGlos();
        pudlo.getOviekt2().dajGlos();
        napisz(kot1);
        napisz(kot2);
        napisz(4);
    }
    public static <T> void napisz (T obiekt1){
        System.out.println(obiekt1);
    }
}
