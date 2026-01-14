public class Main {
    public static void main(String[] args) {
        System.out.println("Halo");
        Gracz gracz1 = new Gracz(new Miecz());
        gracz1.zaatakuj();
        gracz1.setBron(new Rozdzka());
        gracz1.zaatakuj();
        gracz1.setBron(new Topor());
        gracz1.zaatakuj();
        gracz1.setBron(new Jojo());
        gracz1.zaatakuj();
    }
}
