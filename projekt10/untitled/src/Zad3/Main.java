package Zad3;

public class Main {

    public static void main(String[] args) {
        Samochod PT_Cruiser = new Samochod(new BenzynowySilnik());
        PT_Cruiser.start();
        PT_Cruiser.stop();
    }


}
